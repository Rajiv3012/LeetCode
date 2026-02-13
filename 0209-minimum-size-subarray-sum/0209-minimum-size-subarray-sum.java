class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left=0;
        int sum=0;
        int mini=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>=target){
                mini = Math.min(mini,r-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return mini==Integer.MAX_VALUE?0:mini;
    }
}