class Solution {
    public int jump(int[] nums) {
        int maxreach=0;
        int n =nums.length;
        int currend=0;
        int jumps=0;
        for(int i=0;i<n-1;i++){
            maxreach = Math.max(maxreach,i+nums[i]);
            if(currend==i){
                currend=maxreach;
                jumps++;
            }
        }
        return jumps;
    }
}