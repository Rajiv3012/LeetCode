class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int total=0;
        for(int i=n/3;i<n;i+=2){
            total+=piles[i];
        }
        return total;
    }
}