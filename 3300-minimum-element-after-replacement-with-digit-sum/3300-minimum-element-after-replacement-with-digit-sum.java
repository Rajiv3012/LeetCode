class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                int dig= nums[i]%10;
                sum+=dig;
                nums[i]=nums[i]/10;
            }
            nums[i]=sum;
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            mini= Math.min(mini,nums[i]);
        }
        return mini;
    }
}