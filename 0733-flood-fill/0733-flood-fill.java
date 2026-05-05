class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int origionalcolor = image[sr][sc];
        if(origionalcolor==color)return image;
        dfs(image,sr,sc,origionalcolor,color);
        return image;
    }
    public void dfs(int[][]img, int nr,int nc , int color,int newcolor){
        if(color==newcolor)return;
        if(nr<0 || nc<0 || nr>=img.length || nc>=img[0].length)return;
        if(img[nr][nc]!=color)return;
        img[nr][nc]= newcolor;
        dfs(img,nr+1,nc,color,newcolor);
        dfs(img,nr,nc+1,color,newcolor);
        dfs(img,nr-1,nc,color,newcolor);
        dfs(img,nr,nc-1,color,newcolor);
    }
}