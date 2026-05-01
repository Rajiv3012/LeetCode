class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        int n= s.length();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==letter){
                count++;
            }
        }
        int val = (count*100)/n;
        return val;
    }
}