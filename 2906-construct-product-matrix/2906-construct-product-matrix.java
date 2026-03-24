class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 12345;
        int [] prod = new int[m*n];
        int idx =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                prod[idx++]=grid[i][j];
            }
        }
        int ans[] = new int[m*n];
        ans[0]=1;
        for(int i=1;i<prod.length;i++){
            ans[i]= (int)((1L*ans[i-1]*prod[i-1])%MOD);
        }
        int right =1;
        int k = prod.length;
        for(int i=k-1;i>=0;i--){
            ans[i]= (int)((1L*ans[i]*right)%MOD);
            right = (int)((1L * right * prod[i]) % MOD);
        }
        int[][] result = new int[m][n];
        for(int i=0;i<m*n;i++){
            result[i/n][i%n] = ans[i];
        }
        return result;
    }
}