class Solution {
    int []parent;
    int []rank;
    TreeSet<Integer>[] compSet;
    boolean[] offline;
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        parent  = new int[c+1];
        rank = new int[c+1];
        compSet = new TreeSet[c+1];
        offline = new boolean[c+1];

        for(int i=1;i<=c;i++){
            parent[i]=i;
            rank[i]=0;
            compSet[i] = new TreeSet<>();
            compSet[i].add(i);
        }

        for(int edge[]: connections)union(edge[0], edge[1]);

        List<Integer>res = new ArrayList<>();

        for(int q[]: queries){
            int type = q[0], x= q[1];

            if(type==1){
                if(!offline[x])res.add(x);
                else{
                    int root = find(x);
                    if(compSet[root].isEmpty())res.add(-1);
                    else res.add(compSet[root].first());
                }
            }
            else{
                if(!offline[x]){
                    offline[x]=true;
                    int root = find(x);
                    compSet[root].remove(x);
                }
            }
        }
        int ans[]  =new int[res.size()];
        for(int i=0;i<res.size();i++)ans[i]=res.get(i);

        return ans;
    }
    int find(int x){
        if(parent[x]==x)return x;
        return parent[x] = find(parent[x]);
    }
    void union(int a, int b){
        int a_parent = find(a);
        int b_parent = find(b);
        if(a_parent==b_parent)return;
        
        if(rank[a_parent]>rank[b_parent]){
            parent[b_parent]=a_parent;
            compSet[a_parent].addAll(compSet[b_parent]);
        }
        else if(rank[a_parent]<rank[b_parent]){
            parent[a_parent]=b_parent;
            compSet[b_parent].addAll(compSet[a_parent]);
        }
        else{
            parent[a_parent]=b_parent;
            rank[b_parent]++;
            compSet[b_parent].addAll(compSet[a_parent]);
        }
    }

}