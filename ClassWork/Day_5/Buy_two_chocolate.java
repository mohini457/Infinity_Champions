package ClassWork.Day_5;

import java.util.Arrays;

public class Buy_two_chocolate {
    public static void main(String[] args) {
        int prices[]={3,2,3};
        int money=3;
        System.out.print(buyChoco(prices, money));
    }
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(prices[0]+prices[1]>money){
            return money;
        }
        return money-(prices[0]+prices[1]);
    }
}
