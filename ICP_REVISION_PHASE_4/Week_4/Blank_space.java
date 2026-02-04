package ICP_REVISION_PHASE_4.Week_4;

import java.util.*;

public class Blank_space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int left=0,right=0;
            int count=0;
            while(right<n){
                while(right<n && arr[right]==0){
                    right++;
                }
                count=Math.max(count,right-left);
                if(right<n &&arr[right]==1){
                    right++;
                    left=right;
                }


                
            }
            System.out.println(count);
        }
   

    }
}
