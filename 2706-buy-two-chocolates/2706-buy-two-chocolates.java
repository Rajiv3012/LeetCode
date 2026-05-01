class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int k = prices[0]+prices[1];
        if(money-k>=0){
            return money-k;
        }
        return money;
    }
}