class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n =nums.length;
        int ans=0;
        for(int ele: nums){
            while(ele!=0){
                int d= ele%10;
                if(d==digit)ans++;
                ele/=10;
            }
        }   
        return ans;
    }
}