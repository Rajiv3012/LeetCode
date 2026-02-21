class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}