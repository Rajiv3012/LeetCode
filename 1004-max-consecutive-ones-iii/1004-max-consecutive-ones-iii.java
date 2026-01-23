class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left=0;
        int maxlen=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                k--;
            }
            while(k<0){
                if(nums[left]==0){
                    k++;
                }
                left++;
            }
            maxlen= Math.max(maxlen,r-left+1);
        }
    return maxlen;
    }
}