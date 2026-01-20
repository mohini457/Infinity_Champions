package ICP_REVISION_PHASE_4.Week_2.Sheet_1;

import java.util.*;

public class Next_Greater_Element_1 {
    public static void main(String[] args) {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        // int result[]=bruteforce(nums1, nums2);
        int result[]=optimised(nums1, nums2);
        for(int i:result){
            System.out.println(i);
        }
    }
    public static int[] bruteforce(int nums1[], int nums2[]){
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int index=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                    break;
                }
            }
            int next=-1;
            for(int k=index+1;k<nums2.length;k++){
                if(nums2[k]>nums2[index]){
                    next=nums2[k];
                    break;
                }
            }
            ans[i]=next;
        }
        return ans;
    }

    public static int[] optimised(int nums1[], int nums2[]){
        HashMap<Integer, Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;

    }
}
