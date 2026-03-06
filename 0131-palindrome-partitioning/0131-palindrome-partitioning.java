class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        gen(0,s,ans,new ArrayList<>());
        return ans;
    }
    private void gen(int ind,String s,List<List<String>>ans, List<String>ds){
        if(ind==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(palin(s,ind,i)){
                ds.add(s.substring(ind,i+1));
                gen(i+1,s,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    private Boolean palin(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}