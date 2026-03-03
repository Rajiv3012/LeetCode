class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        check(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
    private void check(int ind,int target,int [] arr,List<List<Integer>> ans ,List<Integer>ds ){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            ds.add(arr[i]);
            check(i+1,target-arr[i],arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}