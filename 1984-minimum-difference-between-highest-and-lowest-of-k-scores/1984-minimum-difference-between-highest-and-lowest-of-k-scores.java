class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        int mini= Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n-k+1;i++){
            int r = i+k-1;
            int chotu = nums[r]-nums[i];
            mini = Math.min(mini,chotu);
        }
        return mini;
    }
}