class Solution {
    private boolean safe(int row, int col, char[][] board, int n) {
        int duprow = row, dupcol = col;

        // Upper-left diagonal
        while(row >= 0 && col >= 0) {
            if(board[row][col] == 'Q') return false;
            row--; col--;
        }
        row = duprow; col = dupcol;

        // Pure left
        while(col >= 0) {
            if(board[row][col] == 'Q') return false;
            col--;
        }
        row = duprow; col = dupcol;

        // Lower-left diagonal
        while(row < n && col >= 0) {
            if(board[row][col] == 'Q') return false;
            row++; col--;
        }
        return true;
    }

    private void solve(int col, int n, List<List<String>> ans, char[][] board) {
        if(col == n) {
            List<String> temp = new ArrayList<>();
            for(char[] row : board)
                temp.add(new String(row));
            ans.add(temp);
            return;
        }
        for(int row = 0; row < n; row++) {
            if(safe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(col + 1, n, ans, board);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board)
            Arrays.fill(row, '.');
        solve(0, n, ans, board);
        return ans;
    }
}