class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxlen= 1;
        int left=0;
        int used=0;
        for(int r=0;r<n;r++){
            while((used & nums[r])!=0){
                used^=nums[left];
                left++;
            }
            used = used|nums[r];
            maxlen= Math.max(maxlen,r-left+1);
        }
        return maxlen;
    }
}