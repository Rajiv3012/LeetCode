// User function Template for Java

class Solution {
    public static int solve(int n){
        if(n<0)return 0;
        int mod=n%4;
        if(mod==0)return n;
        if(mod==1)return 1;
        if(mod==2)return n+1;
        return 0;//for 3;
    }
    public static int findXOR(int l, int r) {
        // int res=0;
        // for(int i=l;i<=r;i++){
        //     res=res^i;
        // }
        // return res;     //bruteforce method time complexity jyaada hai
        
        return solve(l-1)^solve(r);
    }
}