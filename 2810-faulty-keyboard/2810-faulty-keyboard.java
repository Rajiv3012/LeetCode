class Solution {
    public String finalString(String s) {
        String rev ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                rev = new StringBuilder(rev).reverse().toString();
            }else{
                rev+=s.charAt(i);
            }
        }
        return rev;
    }
}