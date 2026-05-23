class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]>q = new LinkedList<>();
        int [][]res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    res[i][j]=mat[i][j];
                }else{
                    res[i][j]=-1;
                }
            }
        }
        //push kr diya saare 0 ko aur 1 ko as -1
        int [][] d = {{1,0},{-1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int [] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            for(int []dir: d){
                int nr = r+ dir[0];
                int nc = c+ dir[1];
                if(nr>=0 && nr<m && nc>=0 && nc<n && res[nr][nc]==-1){
                    res[nr][nc]= res[r][c]+1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return res;
    }
}