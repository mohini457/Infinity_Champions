package ICP_REVISION_PHASE_4.Week_5;

import java.util.*;
public class Greetings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[][]=new int[n][2];
            for (int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }
        Arrays.sort(arr,(a,b)->{
                if (a[1] != b[1]) return b[1] - a[1];
                return b[0] - a[0];
            });
        int ans=0;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][0]<arr[j][0]) ans++;
            }
        }
        System.out.println(ans);
    }

    }
}
