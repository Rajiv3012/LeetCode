class Solution {
    public int[] frequencySort(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       Integer [] newNums = new Integer[nums.length];
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        newNums[i]=nums[i];
       }
        Arrays.sort(newNums,(a,b)->{
            if(map.get(a)!=map.get(b)){
                return map.get(a)-map.get(b);
            }else{
                return b-a;
            }
        });
        for(int i=0;i<nums.length;i++){
           nums[i]=newNums[i];
        }
        return nums;
    }
}