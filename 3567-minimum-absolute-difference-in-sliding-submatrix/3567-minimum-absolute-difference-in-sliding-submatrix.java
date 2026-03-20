class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n=grid[0].length;
        int ans[][] = new int[m-k+1][n-k+1];
        int diff =0;
        for(int i=0;i<=m-k;i++){
            for(int j=0;j<=n-k;j++){
                TreeSet<Integer> set = new TreeSet<>();
                for(int r = i;r<i+k;r++){
                    for(int p = j;p<j+k;p++){
                        set.add(grid[r][p]);
                    }
                }
                if(set.size()==1){
                    ans[i][j]=0;
                    continue;
                }
                int mindiff = Integer.MAX_VALUE;
                Integer prev = null;
                for(int val:set){
                    if(prev!=null){
                        mindiff= Math.min(mindiff,val-prev);
                    }
                    prev= val;
                }
                ans[i][j]=mindiff;
            }
        }
        return ans;
    }
}