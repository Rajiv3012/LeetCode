class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int res = nums[0];
        for(int i=0;i<n;i++){
            int freq= map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],freq);
            if(freq>map.getOrDefault(res,0)){
                res = nums[i];
            }
        }
        return res;
    }
}