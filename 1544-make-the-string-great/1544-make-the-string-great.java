class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()&&  Math.abs(st.peek()-ch)==32){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch: st){
            res.append(ch);
        }
        return res.toString();
    }
}