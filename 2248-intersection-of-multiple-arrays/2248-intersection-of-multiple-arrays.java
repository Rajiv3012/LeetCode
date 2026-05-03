class Solution {
    public List<Integer> intersection(int[][] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int m = nums.length;
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<m;i++){
        for(int j=0;j<nums[i].length;j++){
            map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
        }
       }
       for(int key : map.keySet()) {
            if(map.get(key) == m) {
                list.add(key);
            }
        }
       Collections.sort(list);
       return list; 
    }
}