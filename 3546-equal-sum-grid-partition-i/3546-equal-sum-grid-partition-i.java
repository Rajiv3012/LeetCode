class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [] rows = new int[m];
        int [] cols = new int[n];
        long total =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                total+=grid[i][j];
                rows[i]+=grid[i][j];
                cols[j]+=grid[i][j];
            }
        }
        if(total%2!=0){
            return false;
        }
        long upper =0;
        for(int i=0;i<m-1;i++){
            upper+=rows[i];
            if(upper==total-upper){
                return true;
            }
        }
        long left=0;
        for (int j = 0; j < n - 1; j++) {
            left += cols[j];
            if (left == total - left) {
                return true;
            }
        }
        return false;
    }
}