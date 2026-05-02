class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n= img[0].length;
        int [][] newimg = new int[m][n];
        int x []= {-1,-1,0,1,0,1,0,-1,1};
        int y []= { 0,-1,0,0,1,1,-1,1,-1};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                int count=0;
               for(int k=0;k<9;k++){
                int nx = i+x[k];
                int ny = j+y[k];
                    if(nx>=0 && ny>=0 && nx<m && ny<n){
                        sum+=img[nx][ny];
                        count++;
                    }
               }
                newimg[i][j]= sum/count;
            }
        }
        return newimg;
    }
}