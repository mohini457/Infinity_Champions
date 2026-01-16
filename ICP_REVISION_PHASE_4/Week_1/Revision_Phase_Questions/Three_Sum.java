package ICP_REVISION_PHASE_4.Week_1.Revision_Phase_Questions;
import java.util.*;

public class Three_Sum {
    public static void main(String args[]){
        int arr[]={-1,0,1,2,-1,-4};
        // System.out.println(bruteforce(arr));
        System.out.println(optimal(arr));
    }

    // ---------Brute Force approach--------------------

    // In this approach we use three nested loops to check for every triplet 
    // It's time complexity is O(n^3) so it does not pass all the test cases

    public static List<List<Integer>> bruteforce(int nums[]){
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;

        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet=new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        if(!res.contains(triplet)){
                            res.add(triplet);
                        }
                    }
                }
            }
        }
        return res;
    
    }

    //---------------------Optimal approach-----------------------
    
    // In this approach :
    // Step 1: Sort the array
    // Step 2: Fix one element and use two pointer approach to find the other two elements
    // Step 3: We use binary search to find the other two elements
    // Step 4: After initializing low and high pointers, we calculate the sum of three elements
    // Step 5: If the sum is zero, we add the triplet to the result list and move both pointers inside skipping the duplicate elements
    // We move both pointers inside because we are looking for unique triplets ...
    // Step 6: If the sum is less than zero, we move the low pointer to the right to increase the sum
    // Step 7: If the sum is greater than zero, we move the high pointer to the left to decrease the sum
    // It's time complexity is O(n^2).


    public static List<List<Integer>> optimal(int nums[]){
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums); 
        for(int i=0;i<n-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int low=i+1;
                int high=n-1;
                // int sum=0-nums[i];
                while(low<high){
                    int sum=nums[i]+nums[low]+nums[high];
                    if(sum==0){
                        res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low]==nums[low+1]) low++;
                        while(low<high && nums[high]==nums[high-1]) high--;
                        low++;
                        high--;

                    }
                    else if(sum<0){
                        low++;
                    }
                    else{
                        high--;
                    }
                
                }
            }
            
        }
        return res;
    }

}
