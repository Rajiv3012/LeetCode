class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer,Integer> basket= new HashMap<>();
        int maxlen=0;
        int left =0;
        for(int r=0;r<n;r++){
            basket.put(fruits[r],basket.getOrDefault(fruits[r],0)+1);
            while(basket.size()>2){
                basket.put(fruits[left],basket.get(fruits[left])-1);
                if(basket.get(fruits[left])==0){
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxlen = Math.max(maxlen,r-left+1);
            
        }
        return maxlen;
    }
}