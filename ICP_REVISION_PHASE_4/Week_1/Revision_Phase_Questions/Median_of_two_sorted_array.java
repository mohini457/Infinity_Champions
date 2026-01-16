package ICP_REVISION_PHASE_4.Week_1.Revision_Phase_Questions;

import java.util.*;

public class Median_of_two_sorted_array {
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={2};
        // System.out.println(bruteforce(nums1,nums2));
        System.out.println(optimal(nums1,nums2));
        // System.out.println(Onemoreoptimal(nums1,nums2));
    }

    public static double bruteforce(int nums1[], int nums2[]){
        int n1=nums1.length;
        int n2=nums2.length;
        int merged[]=new int[n1+n2];
        for(int i=0;i<n1;i++){
            merged[i]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            merged[n1+i]=nums2[i];
        }
        Arrays.sort(merged);
        if((n1+n2)%2==0){
            return (merged[(n1+n2)/2]+merged[(n1+n2)/2-1])/2.0;
        }
        else{
            return merged[(n1+n2)/2];
        }
    }

    public static double optimal(int nums1[], int nums2[]){
        int n1=nums1.length;
        int n2=nums2.length;
        int merge[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                merge[k++]=nums1[i++];
            }
            else{
                merge[k++]=nums2[j++];
            }
        }
        while(i<n1) merge[k++]=nums1[i++];
        while(j<n2) merge[k++]=nums2[j++];
        if((n1+n2)%2==0){
            return (merge[(n1+n2)/2]+merge[(n1+n2)/2-1])/2.0;
        }
        else{
            return merge[(n1+n2)/2];
        
        }

    }
}
