class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum=0;
        long maxsum=0;
        int left=0;
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            sum+=nums[r];
            if(r - left + 1 > k){
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                sum= sum-nums[left];
                left++;
            }
            if(r - left + 1 == k && map.size() == k){
                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }
}