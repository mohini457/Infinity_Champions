package ICP_REVISION_PHASE_4.Week_1.Revision_Phase_Questions;

public class Find_Missing_Positive {
    public static void main(String[] args) {
        // int arr[]={3,4,-1,1};
        int arr[]={7,8,9,11,12};
        System.out.println(bruteforce(arr));
       // System.out.println(findMissingPositive(arr));
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

    //Optimal Approach
    // In this approach we will place each number at its correct index (number 1 at index 0,and so on) and then 
    // we will traverse the array and check for the first index where the number is not equal to index+1 and return index+1


    public static int findMissingPositive(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]>0 && nums[i]<n && nums[nums[i]-1]!=nums[i]){ // place nums[i] at its correct index
                swap(nums, i, nums[i]-1); // swaping 
            }
        }
        for(int i=0;i<n;i++){ // traversing the array
            if(nums[i]!=i+1) return i+1; 
        }
        return n+1;  
    }
    public static void swap(int nums[], int i, int j){ // swap function
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    
    }
}
