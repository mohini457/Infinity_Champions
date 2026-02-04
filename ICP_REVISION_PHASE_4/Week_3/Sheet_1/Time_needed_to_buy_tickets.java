package ICP_REVISION_PHASE_4.Week_3.Sheet_1;

import java.util.*;

public class Time_needed_to_buy_tickets {
    public static void main(String[] args) {
        int tickets[]={2,3,2};
        int k=2;
        // System.out.println(timeRequired(tickets, k));
        System.out.println(usingqueue(tickets, k));
    }
    public static int timeRequired(int tickets[],int k){
        int t=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                t+=Math.min(tickets[i],tickets[k]);
            }
            else{
                t+=Math.min(tickets[i],tickets[k]-1);
            }
        }
        return t;
    }

    

    }
}
