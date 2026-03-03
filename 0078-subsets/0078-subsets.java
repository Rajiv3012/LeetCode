class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        gen(0,nums,ans,new ArrayList<>());
        return ans;
    }
    private void gen(int ind,int[] nums,List<List<Integer>>ans , List<Integer>ds){
        if(ind==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        gen(ind+1,nums,ans,ds);
        ds.remove(ds.size()-1);
        gen(ind+1,nums,ans,ds);
    }
}