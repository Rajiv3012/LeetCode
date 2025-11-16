class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max=nums[0];
        int mini=nums[0];
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){

            max=Math.max(nums[i],max);
            mini=Math.min(nums[i],mini);
        }
        int secmax=nums[n-2];
        return max+secmax-mini;
    }
}