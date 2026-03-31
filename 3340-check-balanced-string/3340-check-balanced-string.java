class Solution {
    public boolean isBalanced(String num) {
        int val =0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                val = val+ (num.charAt(i)-'0');
            }else{
                val=val-(num.charAt(i)-'0');
            }
        }
        return val==0;
    }
}