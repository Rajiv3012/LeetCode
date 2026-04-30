class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(String c:words1){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(String c:words2){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        int count=0;
        for(String c: words2){
            if(map1.containsKey(c) && map1.get(c)==1 && map2.get(c)==1 && map1.containsKey(c)){
                count++;
            }
        }
        return count;
    }
}