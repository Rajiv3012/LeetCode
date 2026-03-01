class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> result = new ArrayList<>();
        gen(n,"",result);
        return result;
    }
        private void gen(int n , String curr, ArrayList<String> result){
        if(curr.length()==n){
            result.add(curr);
            return;   
        }
        gen(n,curr+"1",result);
        if (curr.length() == 0 || curr.charAt(curr.length() - 1) != '0') {
        gen(n, curr + "0", result);
        }
    }

}