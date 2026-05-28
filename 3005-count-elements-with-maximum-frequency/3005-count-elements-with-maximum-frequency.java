class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxi=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int a = entry.getValue();
            maxi= Math.max(maxi,a);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==maxi){
                count++;
            }
        }
        return maxi*count;
    }
}