package Assignments.Assignment_5;

public class Lemonade_change {
    public static void main(String[] args) {
        int bills[]={5,5,10,10,20};
        System.out.print(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int count5=0;
        int count10=0;
        int count20=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count5++;
            }
            else if(bills[i]==10){
                if(count5==0) return false;
                count5--;
                count10++;  
            }
            else {
                if (count10 > 0 && count5 > 0) {
                    count10--;
                    count5--;
                } 
                else if (count5 >= 3) {
                    count5 -= 3;
                } 
                else return false;
            
            }
        }
        return true;
    }
}
