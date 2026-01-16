package ICP_REVISION_PHASE_4.Week_1;

import java.util.*;

public class Best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int prices[]=new int[n];
        // for (int i=0;i<n;i++){
        //     prices[i]=sc.nextInt();
        // }
        // int prices[]={7,6,4,3,1};
        int prices[]={7,1,5,3,6,4};
        // System.out.println(maxProfit(prices));
        System.out.println(bruteforce(prices));
    }
    public static int bruteforce(int prices[]){
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    int profit=prices[j]-prices[i];
                    maxProfit=Math.max(maxProfit,profit);
                }
            }
        }
        return maxProfit;
    }
    public static int maxProfit(int prices[]){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
                maxProfit=Math.max(maxProfit, prices[i]-minPrice);
            }
        }
        return maxProfit;
    }
}
