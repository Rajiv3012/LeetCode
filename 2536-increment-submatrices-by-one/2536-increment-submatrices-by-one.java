class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int mat[][] = new int[n][n];
        for(int q[]: queries){
            int row1 = q[0], col1 = q[1], row2 = q[2], col2=q[3];

            for(int i=row1;i<=row2;i++){
                mat[i][col1]+=1;
                if(col2+1<n)mat[i][col2+1]-=1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++)mat[i][j]+=mat[i][j-1];
        }
        return mat;
    }
}
