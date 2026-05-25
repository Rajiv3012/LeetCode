class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<int[]>q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || i==m-1 || j==0 || j==n-1)&&grid[i][j]==1){
                    q.offer(new int[]{i,j});
                    grid[i][j]= 2;
                }
            }
        }
        int [][] dir = {{1,0},{-1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int [] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            for(int []d:dir){
                int nr = r+ d[0];
                int nc = c+ d[1];
                if(nr>=0 && nr<m && nc>= 0 && nc<n && grid[nr][nc]==1){
                    q.offer(new int[]{nr,nc});
                    grid[nr][nc]=2;
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}