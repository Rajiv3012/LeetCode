class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len=0;
        int maxi=0;
        int n=nums.length;
        for(int r=0;r<nums.length-1;r++){
            if(nums[r]<nums[r+1]){
                len++;
            }else{
                len=0;
            }
            maxi= Math.max(maxi,len);
        }
        return maxi+1;
    }
}