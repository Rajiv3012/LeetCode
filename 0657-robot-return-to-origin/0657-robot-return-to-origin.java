class Solution {
    public boolean judgeCircle(String moves) {
        int count=0;
        int count1=0;
        for(char c : moves.toCharArray()){
            if(c=='U'){
                count++;
            }
            if(c=='D'){
                count--;
            }
            if(c=='R'){
                count1++;
            }
            if(c=='L'){
                count1--;
            }
        }
        return count==0 && count1==0;
    }
}