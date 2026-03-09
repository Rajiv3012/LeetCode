class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendSet = new HashSet<>();
        for(int i:friends){
            friendSet.add(i);
        }
        List<Integer> result = new ArrayList<>();
        for(int o:order){
            if(friendSet.contains(o)){
                result.add(o);
            }
        }
        int arr[] = new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i]=result.get(i);
        }
        return arr;
    }
}