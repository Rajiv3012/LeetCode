class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String [] map = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        gen(0,digits,new StringBuilder(),map,ans);
        return ans;
    }
    private void gen(int ind,String digits,StringBuilder curr, String []Map,List<String>ans){
        if(digits.length()==curr.length()){
            ans.add(curr.toString());
            return;
        }
        String letters = Map[digits.charAt(ind)-'0'];
        if(letters.length() == 0){
        gen(ind + 1, digits, curr, Map, ans);
        return;
        }

        for(char c: letters.toCharArray()){
            curr.append(c);
            gen(ind+1,digits,curr,Map,ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}