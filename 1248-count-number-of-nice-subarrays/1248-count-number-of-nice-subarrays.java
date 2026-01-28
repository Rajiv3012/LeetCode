class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }
    private int atmost(int [] nums, int k){
        int n = nums.length;
        int left =0;
        int count=0;
        for(int r=0;r<n;r++){
            if(nums[r]%2!=0){
                k--;
            }
            while(k<0){
                if(nums[left]%2!=0){
                    k++;
                }
                left++;
            }
            count+= (r-left+1);
        }
        return count;
    }
}