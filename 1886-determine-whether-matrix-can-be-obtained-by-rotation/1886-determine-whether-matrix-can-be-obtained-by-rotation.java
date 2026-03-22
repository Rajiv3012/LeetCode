class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {        // 0°, 90°, 180°, 270° check karo
            if (Arrays.deepEquals(mat, target)) return true;//deepEquals se matrix compare hota
            mat = rotate(mat);
        }
        return false;
    }

    public int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = mat[i][j];   // 90° clockwise formula
            }
        }
        return res;
    }
}