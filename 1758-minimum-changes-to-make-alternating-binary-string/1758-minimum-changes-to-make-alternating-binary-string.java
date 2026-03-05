class Solution {
    public int minOperations(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c != (i % 2 == 0 ? '0' : '1')){
                a++;
            }
            // pattern starting with 1 -> 101010
            if(c != (i % 2 == 0 ? '1' : '0')){
                b++;
            }
        }
        return Math.min(a,b);
    }
}