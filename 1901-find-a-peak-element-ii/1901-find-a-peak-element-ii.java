class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int [][] dir= {{0,1},{1,0},{-1,0},{0,-1}};
        int []arr= new int[2];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                boolean peak= true;
                for(int k=0;k<4;k++){
                    int nx = i+dir[k][0];
                    int ny = j+dir[k][1];
                    if(nx>=0 && ny>=0 && nx<mat.length && ny<mat[0].length){
                        if(mat[nx][ny]>mat[i][j]){
                            peak=false;
                            break;
                        }
                    }
                }         
                if(peak){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}