package ICP_REVISION_PHASE_4.Week_2.Sheet_2;

import java.util.*;

public class Next_Greater_Element_2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int result[]=next_greater2(arr);
        for(int i:result){
            System.out.println(i);
        }
    }

    public static int[] next_greater2(int nums[]){
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[idx]=-1;
            }
            else{
                ans[idx]=st.peek();
            }
            st.push(nums[idx]);
        }
        return ans;
    }
}
