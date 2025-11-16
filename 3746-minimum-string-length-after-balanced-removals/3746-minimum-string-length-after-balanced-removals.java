class Solution {
    public int minLengthAfterRemovals(String s) {
        int counta=0;
        int countb=0;
        char [] c = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]=='a'){
                counta++;
            }
            if(c[i]=='b'){
                countb++;
            }
        }
        return Math.abs(counta-countb);
    }
}