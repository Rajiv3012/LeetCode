class Solution {

    static void swap(int[][] grid, int r1, int r2, int y, int k){
        for(int j = y; j < y + k; j++){
            int temp = grid[r1][j];
            grid[r1][j] = grid[r2][j];
            grid[r2][j] = temp;
        }
    }

    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i = 0; i < k / 2; i++){
            swap(grid, x + i, x + k - 1 - i, y, k);
        }
        return grid;
    }
}