class Solution {
    public int orangesRotting(int[][] grid) {
        //multisource bfs
        int rows = grid.length;
        int cols= grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        //track all the intial rotten oranges
        int fresh=0; // this to count all the exisiting fresh at initial
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)return 0;
        int mins=0;
        int[] dr = {-1,0,1,0};
        int[] dc = {0,-1,0,1};
        while(!q.isEmpty()){
            int size = q.size();
            boolean isrotten = false;
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                int r =curr[0];
                int c = curr[1];
                for(int d=0;d<4;d++){//4 sides ghumna hai
                    int nr= r+dr[d];
                    int nc= c+dc[d];
                    if(nr>=0 && nc>=0 && nr<rows && nc<cols && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                        fresh--;
                        isrotten= true;
                    }
                }
            }
            if(isrotten){
                mins++;
            }
        }
        if(fresh>0)return -1;//fresh bach gya 
        return mins;
    }
}