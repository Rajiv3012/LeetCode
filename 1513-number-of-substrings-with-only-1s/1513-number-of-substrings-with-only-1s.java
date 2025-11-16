class Solution {
    int MOD = 1000000007;
    public int numSub(String s) {
        int ans = 0;
        int count=0;
        int n=s.length();
        for(char ch: s.toCharArray()){
            if(ch=='1'){
                count++;
                ans=(ans+count)%MOD;
            }
            else count=0;
        }
        return ans;
    }

}