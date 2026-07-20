class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==y){
                sb.append(y);
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==y){
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}