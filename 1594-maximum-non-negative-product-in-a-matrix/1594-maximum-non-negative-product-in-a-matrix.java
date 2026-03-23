class Solution {
    public int maxProductPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long MOD = 1_000_000_007L;

        long[][] maxP = new long[m][n];
        long[][] minP = new long[m][n];

        maxP[0][0] = minP[0][0] = grid[0][0];

        // Fill first row
        for (int j = 1; j < n; j++) {
            maxP[0][j] = maxP[0][j-1] * grid[0][j];
            minP[0][j] = minP[0][j-1] * grid[0][j];
        }

        // Fill first column
        for (int i = 1; i < m; i++) {
            maxP[i][0] = maxP[i-1][0] * grid[i][0];
            minP[i][0] = minP[i-1][0] * grid[i][0];
        }

        // Fill rest
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                long val = grid[i][j];
                long a = maxP[i-1][j] * val;
                long b = minP[i-1][j] * val;
                long c = maxP[i][j-1] * val;
                long d = minP[i][j-1] * val;

                maxP[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
                minP[i][j] = Math.min(Math.min(a, b), Math.min(c, d));
            }
        }

        long ans = maxP[m-1][n-1];
        if (ans < 0) return -1;
        return (int)(ans % MOD);
    }
}