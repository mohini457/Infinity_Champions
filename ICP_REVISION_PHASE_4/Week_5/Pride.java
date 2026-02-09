package ICP_REVISION_PHASE_4.Week_5;

import java.util.*;

public class Pride {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int ans=0;
        for(int i=0;i<n;i++){
            ans=gcd(arr[i],ans);
        }
        if(ans!=1) {
            System.out.print(-1);
            return;
        }
        int ones=0;
        for (int i=0;i<n;i++){
            if(arr[i]==1) ones++;
        }
        if(ones>0){
            System.out.println(n-ones);
            return;
        }
        int len=Integer.MAX_VALUE;
        for (int i = 0; i <n; i++){
            int s=0;
            for(int j=i;j<n;j++){
                s=gcd(s,arr[j]);
                if(s==1){
                    len=Math.min(len,j-i+1);
                    break; 
                }
            } 
        }
        // System.out.println(l
        // en==Integer.MAX_VALUE ? -1 : len)

        int res=len-1+n-1; 
        System.out.println(res);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
