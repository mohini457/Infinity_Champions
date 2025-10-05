package Assignments.Assignment_7;

public class House_Robber {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = 0;      // dp[i-2]
        int prev1 = 0;      // dp[i-1]
        for (int x : nums) {
            int cur = Math.max(prev1, x + prev2);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
