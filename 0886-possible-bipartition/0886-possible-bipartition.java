class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        int []color = new int[n+1];
        Arrays.fill(color,-1);
        for(int i=0;i<dislikes.length;i++){
            int u = dislikes[i][0];
            int v = dislikes[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i=1;i<=n;i++){
            if(color[i]==-1){
                if(!dfs(i,0,adj,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int node,int currcolor,ArrayList<ArrayList<Integer>> adj ,int[]color){
        color[node]=currcolor;
        for(int nei:adj.get(node)){
            if(color[nei]==-1){
                if(!dfs(nei,1-currcolor,adj,color)){
                    return false;
                }
            }else if(color[nei]==currcolor){
                return false;
            }
        }
        return true;
    }
}