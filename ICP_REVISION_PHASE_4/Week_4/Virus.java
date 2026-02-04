package ICP_REVISION_PHASE_4.Week_4;
import java.util.*;

public class Virus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int m=sc.nextInt();
            long arr[]=new long[m];
            for (int i=0;i<m;i++){
                arr[i]=sc.nextLong();
            }
            System.out.println(minimumhouseinfected(n, m, arr));
        }
    }

    public static long minimumhouseinfected(long n,int m,long arr[]){
        
        Arrays.sort(arr);
        List<Long> s=new ArrayList<>();
        for(int i=0;i<m-1;i++){
            long gap=arr[i+1]-arr[i]-1;
            if(gap>0){
                s.add(gap);
            }
        }
        long endgap=n-arr[m-1]+arr[0]-1;
        if(endgap>0) s.add(endgap);

        s.sort((a,b)->Long.compare(b,a));
        int t=0;
        long saved=0;
        for(long i:s){
            long currentgap=i-2*t;
            if(currentgap<=0) continue;
            saved+=Math.max(1,currentgap-1);
            t+=2;
        }
        return n-saved;
        
    }

}
