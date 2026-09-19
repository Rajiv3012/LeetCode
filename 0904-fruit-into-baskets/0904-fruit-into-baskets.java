class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int l=0;
       int maxlen=0;
       for(int i=0;i<fruits.length;i++){
        map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
        while(map.size()>2){
            map.put(fruits[l],map.get(fruits[l])-1);
            if(map.get(fruits[l])==0){
                map.remove(fruits[l]);
            }
            l++;
        }
        maxlen=Math.max(maxlen,i-l+1);
       }
       return maxlen; 
    }
}