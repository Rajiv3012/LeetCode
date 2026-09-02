class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>>revadj = new ArrayList<>();
        for(int i=0;i<n;i++){
            revadj.add(new ArrayList<>());
        }
        int []outdegree= new int[n];
        for(int i=0;i<n;i++){
            for(int nei:graph[i]){
                revadj.get(nei).add(i);
                outdegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(outdegree[i]==0){
                q.add(i);
            }
        }
        List<Integer>safenodes= new ArrayList<>();
        while(!q.isEmpty()){
            int node= q.poll();
            safenodes.add(node);
            for(int nei:revadj.get(node)){
                outdegree[nei]--;
                if(outdegree[nei]==0){
                    q.add(nei);
                }
            }
        }
        Collections.sort(safenodes);
        return safenodes;
    }
}