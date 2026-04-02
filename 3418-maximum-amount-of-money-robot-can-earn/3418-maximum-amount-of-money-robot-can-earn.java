class Solution {
    int m,n;
    int[][][]dp;
    public int maximumAmount(int[][] coins) {
        m=coins.length;
        n = coins[0].length;
        dp= new int[m][n][3];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]= Integer.MIN_VALUE;
                }
            }
        }
        return solve(coins,0,0,2);
    }
    private int solve(int [][]coins,int i,int j,int nue){
        //invalid path
        if(i==m-1&& j==n-1){
            if(coins[i][j]<0 && nue>0){
                return 0;
            }
            return coins[i][j];
        }
        if(i>=m || j>=n)
        return Integer.MIN_VALUE;
        //yaad krne ka samay
        if(dp[i][j][nue]!=Integer.MIN_VALUE)return dp[i][j][nue];
        int best = Integer.MIN_VALUE;
        //move down
        int down= solve(coins,i+1,j,nue);
        if(down!=Integer.MIN_VALUE){
            best= Math.max(best,coins[i][j]+down);
        }
        //move right
        int right = solve(coins,i,j+1,nue);
        if(right!=Integer.MIN_VALUE){
            best= Math.max(best,coins[i][j]+right);
        }
        //nuetralise ka samay
        if(coins[i][j]<0 && nue>0){
            int downskip= solve(coins,i+1,j,nue-1);
            int rightskip = solve(coins,i,j+1,nue-1);
            int skipBest = Math.max(downskip,rightskip);
            if(skipBest!=Integer.MIN_VALUE){
                best = Math.max(best,skipBest);
            }
        }
        return dp[i][j][nue]=best;
    }
}