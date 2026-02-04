package ICP_REVISION_PHASE_4.Week_2.Challenges_Question;

import java.util.*;

public class Sum_of_Total_Strength_of_Wizards {
    public static void main(String[] args) {
        int arr[]={1, 3, 1, 2};
        System.out.println(totalstrength(arr));
    }

    public static int totalstrength(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        for (int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            } 
            if(st.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=n;
            }
            else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        long prefix[]=new long[n+1];
        for (int i=0;i<n;i++){
            prefix[i+1]=(prefix[i]+arr[i])%1000000007;
        }
        long total=0;
        for (int i=0;i<n;i++){
            int l=left[i]+1;
            int r=right[i];
            long sumLeft=(prefix[i+1]-prefix[l]+1000000007)%1000000007;
            long sumRght=(prefix[r+1]-prefix[i+1]+1000000007)%1000000007;
            long countl=(i-l+1);
            int countr=(r-i);
            long c=(countl*sumLeft+sumRght*countr)%1000000007;
            total=(total+(c*arr[i])%1000000007)%1000000007; 
        }
        return (int)total;
    }
}
