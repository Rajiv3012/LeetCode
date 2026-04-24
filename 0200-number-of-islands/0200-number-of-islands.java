class Solution {
    public int numIslands(char[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    bfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i , int j,char[][]grid){
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length;
        int n= grid[0].length;
        q.offer(new int[]{i,j});
        grid[i][j]='0';//marked visited
        int [][] dirs= {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[]curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for(int [] d: dirs){
                int nx = x+d[0];
                int ny = y+d[1];
                if(nx>=0&& ny>=0 && nx<m && ny<n && grid[nx][ny]=='1'){
                    q.offer(new int[]{nx,ny});
                    grid[nx][ny]=0;//marked
                }
            }
        }
    }
}


//dfs
// class Solution {
//     public int numIslands(char[][] grid) {
//         int m = grid.length;
//         int n = grid[0].length;
//         int count = 0;

//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){
//                 if(grid[i][j] == '1'){
//                     dfs(grid, i, j);
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     private void dfs(char[][] grid, int i, int j){
//         int m = grid.length;
//         int n = grid[0].length;

//         if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0'){
//             return;
//         }

//         grid[i][j] = '0'; // mark visited

//         dfs(grid, i+1, j);
//         dfs(grid, i-1, j);
//         dfs(grid, i, j+1);
//         dfs(grid, i, j-1);
//     }
// }