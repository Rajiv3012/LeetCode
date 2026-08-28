class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int []color = new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!dfs(i,0,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int node,int currcolor,int [][]graph,int[]color){
        color[node]=currcolor;
        for(int nei:graph[node]){
            if(color[nei]==-1){
                if(!dfs(nei,1-currcolor,graph,color)){
                    return false;
                }
            }else if(color[nei]==currcolor){
                return false;
            }
        }
        return true;
    }
}