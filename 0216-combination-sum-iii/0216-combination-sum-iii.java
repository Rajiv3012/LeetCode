//given an array arr = {1,2,3,4,5,6,7,8,9} , find all subsequences of size k that sums up to n.
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        gen(1,0,k,n,ans,new ArrayList<>());
        return ans;
        
    }
    private void gen(int ind,int sum,int k,int n,List<List<Integer>>ans, List<Integer>ds){
        if(ds.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(ds));
            }
        }
        for(int i=ind;i<=9;i++){
            if(sum+i>n){
                break;
            }
            ds.add(i);
            gen(i+1,sum+i,k,n,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}