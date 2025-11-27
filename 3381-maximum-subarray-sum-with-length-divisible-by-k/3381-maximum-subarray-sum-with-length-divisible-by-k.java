class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long [] pref = new long[n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        long ans = Long.MIN_VALUE;
        for(int start=0;start<k;start++)
        {
            long currsum = Long.MIN_VALUE;
            for(int i=start;i<n;i=i+k){
                int j=i+k-1;
                if(j>=n){
                    break;
                }
                long subsum=(i==0)?pref[j]:pref[j]-(pref[i-1]);
                if(currsum<0){
                    currsum=subsum;
                }else{
                    currsum+=subsum;
                }
                ans=Math.max(ans,currsum);
            }
        }
        return ans;
    }
}