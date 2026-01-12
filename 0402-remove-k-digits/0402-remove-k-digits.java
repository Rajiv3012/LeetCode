class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        for(int i=0;i<n;i++){
            char digits = num.charAt(i);
            while(!st.isEmpty() && k >0 && st.peek()>digits){
                st.pop();
                k--;
            }
            st.push(digits);
        }
            while(k>0){
                st.pop();
                k--;
            }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        } 
        while(res.length()>0 && res.charAt(res.length()-1)=='0'){
            res.deleteCharAt(res.length()-1);
        }
        if (res.length() == 0) return "0";
        return res.reverse().toString();
    }
}