class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        gen(0,nums,ans,new ArrayList<>());
        return ans;
    }
    private void gen(int ind,int [] nums,List<List<Integer>> ans, List<Integer>ds){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]){
                continue;
            }
                ds.add(nums[i]);
                gen(i+1,nums,ans,ds);
                ds.remove(ds.size()-1);
        }
    }
}