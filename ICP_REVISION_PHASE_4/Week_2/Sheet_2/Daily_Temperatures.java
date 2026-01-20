package ICP_REVISION_PHASE_4.Week_2.Sheet_2;

import java.util.*;

public class Daily_Temperatures {
    public static void main(String[] args) {
        int arr[]={73,74,75,71,69,72,76,73};
        int result[]=dailytemperature(arr);
        for(int i:result){
            System.out.println(i);
        }
    }

    public static int[] dailytemperature(int arr[]){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}
