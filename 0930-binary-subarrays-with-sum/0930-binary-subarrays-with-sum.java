import java.util.*;

class Solution {

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums, goal) - atmost(nums, goal - 1);
    }

    private int atmost(int[] nums, int goal) {
        if (goal < 0) return 0;

        int l = 0, r = 0;
        int sum = 0, count = 0;

        while (r < nums.length) {
            sum += nums[r];

            while (sum > goal) {
                sum -= nums[l];
                l++;
            }

            count += (r - l + 1);
            r++;
        }
        return count;
    }

    // 🔹 Main method
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example input
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        int result = sol.numSubarraysWithSum(nums, goal);
        System.out.println("Number of subarrays with sum = " + goal + " : " + result);
    }
}
