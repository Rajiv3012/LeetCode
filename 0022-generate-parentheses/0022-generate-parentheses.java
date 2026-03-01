class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        gen(n,0,0,"",res);
        return res;
    }
    private void gen(int n,int open,int close,String curr,List<String> res){
        if(curr.length()== 2*n){
            res.add(curr);
            return;
        }
        if(open<n){
            gen(n,open+1,close,curr+'(',res);
        }
        if(close<open){
            gen(n,open,close+1,curr+')',res);
        }
    }
}