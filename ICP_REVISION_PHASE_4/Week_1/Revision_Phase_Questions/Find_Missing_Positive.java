package ICP_REVISION_PHASE_4.Week_1.Revision_Phase_Questions;

public class Find_Missing_Positive {
    public static void main(String[] args) {
        // int arr[]={3,4,-1,1};
        int arr[]={7,8,9,11,12};
        // System.out.println(findMissingPositive(arr));
        System.out.println(bruteforce(arr));
       
    }

    
    // ----------------------------------------------------------------------------

    // Brute Force Approach
    // In this approach we will check for every number from 1 to n whether it is present in the array or not..

    public static int bruteforce(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            boolean found=false; // to check whether i+1 is present in the array or not
            for(int j=0;j<n;j++){
                if(nums[j]==i+1){ // if found then break the loop
                    found=true;
                    break;
                }
            }
            if(!found) return i+1; // if not found return i+1
        }
        return n+1; // if all numbers from 1 to n are present then return n+1;
    }

    // -----------------------------------------------------------------------------


    public static int findMissingPositive(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]>0 && nums[i]<n && nums[nums[i]-1]!=nums[i]){
                swap(nums, i, nums[i]-1);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return n+1;
    }
    public static void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    
    }
}
