class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                s1.append(ch);
            }
        }
        String a = s1.toString();
        String b= s1.reverse().toString();
        return a.equals(b);
    }
}