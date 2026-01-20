package ICP_REVISION_PHASE_4.Week_2.Sheet_1;

import java.util.Stack;

public class Help_Classmate {
    public static void main(String[] args) {
        int arr[]={3, 8, 5, 2, 25};
        int n=arr.length;
        int result[]=help_classmate(arr, n);
        for(int i:result){
            System.out.println(i);
        }
    }
    public static int[] help_classmate(int nums[], int n) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
               ans[i]=-1;
            }
            else{
               ans[i]=st.peek();
            }
            st.push(nums[i]);
        }
        
        return ans;
    }
}
