class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi=nums[0];
        int count=0;
        long ans=0;
        int left=0;
        for(int r=0;r<nums.length;r++){
            maxi = Math.max(maxi,nums[r]);
        }
        for(int r=0;r<nums.length;r++){
            if(nums[r]==maxi){
                count++;
            }
            while(count>=k){
                ans += nums.length-r;
                if(nums[left]==maxi){
                    count--;
                }
                left++;
            }
        }
        return ans; 
    }
}