class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        int m=grid.length;
        int n= grid[0].length;
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    if(j%2==0){
                        list.add(grid[i][j]);
                    }
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    if(j%2!=0){
                        list.add(grid[i][j]);
                    }
                }
            }
        }
        return list;
    }
}