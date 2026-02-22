class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=1;
        int maxsum=0;
        Arrays.sort(nums);
        while(right<n){
            maxsum+=Math.min(nums[left],nums[right]);
            left+=2;
            right+=2;
        }
        return maxsum;
    }
}