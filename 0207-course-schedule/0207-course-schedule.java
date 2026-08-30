class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v= prerequisites[i][1];
            adj.get(v).add(u);
        }
        int []vis = new int[numCourses];
        int []pathvis= new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){

                if(dfs(i,adj,vis,pathvis)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,int []vis,int []pathvis){
        vis[node]=1;
        pathvis[node]=1;
        for(int nei:adj.get(node)){
            if(vis[nei]==0){
                if(dfs(nei,adj,vis,pathvis)){
                    return true;
                }
            }else if(pathvis[nei]==1){
                return true;
            }
        }
        pathvis[node]=0;
        return false;
    }
}