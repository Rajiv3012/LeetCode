class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        double maxavg = Double.NEGATIVE_INFINITY;
        double sum = 0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(r-l+1>k){
                sum-=nums[l];
                l++;
            }if(r-l+1==k){
                maxavg = Math.max(maxavg,sum/k);
            }
        }
        return maxavg;
    }
}