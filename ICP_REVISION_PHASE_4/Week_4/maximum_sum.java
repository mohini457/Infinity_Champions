package ICP_REVISION_PHASE_4.Week_4;

import java.util.*;

public class maximum_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        // ArrayList<Integer> nums=new ArrayList<>();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> nums=new ArrayList<>();
            for (int i=0;i<n;i++){
                nums.add(sc.nextInt());
            }
            // ArrayList<Integer> nums=new ArrayList<>();
            nums.sort((a,b)->a-b);
           
            while(k-->0 && nums.size()>0){
                int len=nums.size();
                nums.remove(len-1);
            }
            long sum=0;
            for(int i:nums){
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}
