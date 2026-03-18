class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count=0;
        int [][] pre = new int [m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                pre[i+1][j+1] = pre[i+1][j]+pre[i][j+1] - pre[i][j]+grid[i][j];
                if(pre[i+1][j+1]<=k){
                    count++;
                }
            }
        }
        return count;
    }
}