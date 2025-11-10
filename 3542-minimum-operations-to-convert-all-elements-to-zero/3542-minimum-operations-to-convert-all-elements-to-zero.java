class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ops = 0;

        for (int i = 0; i < n; i++) {
            // skip zeros
            if (nums[i] == 0) continue;

            ops++; // one new operation
            int min = nums[i];

            // reduce subarray till the next zero region
            for (int j = i; j < n && nums[j] > 0; j++) {
                nums[j] -= min;
            }
        }
        return ops;
    }
}
