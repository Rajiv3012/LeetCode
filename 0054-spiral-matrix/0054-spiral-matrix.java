class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        List<Integer> mat = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // Left -> Right
            for (int i = left; i <= right; i++) {
                mat.add(matrix[top][i]);
            }
            top++;

            // Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                mat.add(matrix[i][right]);
            }
            right--;

            // Right -> Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    mat.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    mat.add(matrix[i][left]);
                }
                left++;
            }
        }

        return mat;
    }
}