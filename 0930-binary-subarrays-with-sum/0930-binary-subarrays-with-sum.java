class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)- atmost(nums,goal-1);
    }
    private int atmost(int [] nums,int goal){
        int sum=0;
        int n = nums.length;
        int left=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(goal<0){
                return 0;
            }
            sum+=nums[i];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=(i-left+1);
        }
        return count;
    }
}