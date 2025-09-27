public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int arr[]=searchRange(nums,target);
        for(int item:arr) System.out.print(item+" ");
    }

        public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        if (first == -1) {
            return new int[]{-1, -1}; // target not found
        }
        
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    
    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int firstPos = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                firstPos = mid;
                right = mid - 1; // continue searching in the left half
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return firstPos;
    }
    
    private static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int lastPos = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                lastPos = mid;
                left = mid + 1; // continue searching in the right half
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return lastPos;
    
    }
}
