class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int result = Integer.MAX_VALUE;
        if(n<3)return -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]!=nums[j]) continue;
                for(int k=j+1;k<n;k++){
                    if(nums[j]!=nums[k]) continue;
                    if(nums[i]==nums[j] && nums[j] == nums[k] && nums[k]==nums[i]){
                        result = Math.min(result,2*(k-i));
                    }
                }
            }
        }
        if(result==Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }
}