class Solution {
    Integer dp[][][];
    int MOD = 1000000007;
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length, n=grid[0].length;
        dp = new Integer[m][n][k];
        return solve(grid, k, 0,0,0,m,n);
    }
    int solve(int [][]arr, int k, int r, int c, int sum, int m, int n){
        if(r>=m||c>=n)return 0;
        sum+=arr[r][c];
        int mod = sum%k;
        if(dp[r][c][mod]!=null)return dp[r][c][mod];
        if(r==m-1&&c==n-1)return dp[r][c][mod]=(mod==0?1:0);
        long down = solve(arr, k, r+1,c,sum,m, n);
        long right = solve(arr,k,r,c+1,sum,m,n);
        
        return dp[r][c][mod] = (int)((down+right)%MOD);
    }
}