class Solution {
    public long rob(int[] nums, int[] colors) {
        int [][] torunelixa = new int[][]{nums,colors};
        int n= nums.length;
        long take=nums[0];
        long skip=0;
        if(n==1){
            return nums[0];
        }
        for(int i=1;i<n;i++){
            long newTake;
            if(colors[i]== colors[i-1]){
                newTake = nums[i]+skip;
            }else{
                
                newTake= nums[i]+Math.max(take,skip);
            }
            long newSkip = Math.max(take,skip);
            take= newTake;
            skip= newSkip;
        }
        return Math.max(take,skip);
    }
}