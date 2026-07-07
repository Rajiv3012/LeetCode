class Solution {
    public int maxDigitRange(int[] nums) {
        int max=-1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int rect =0;
            int mini = 9;
            int maxi=0;
            while(num>0){
                int dig=num%10;
                mini= Math.min(mini,dig);
                maxi= Math.max(maxi,dig);
                num=num/10;
            }
            rect= maxi-mini;
            if (rect > max) {
                max = rect ;
                ans = nums[i];  
            }
            else if (rect == max) {
                ans += nums[i];  
            }
        }
    return ans;
    }
}