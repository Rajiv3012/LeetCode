class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;
        int w = 0;

        for (int i = 0; i < n; i++) {
            if (w < k || nums[i] != nums[w - k]) {
                nums[w++] = nums[i];
            }
        }

        int[] res = new int[w];

        for (int i = 0; i < w; i++) {
            res[i] = nums[i];
        }

        return res;
    }
}