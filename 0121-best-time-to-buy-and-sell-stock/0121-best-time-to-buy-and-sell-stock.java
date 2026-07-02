class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0]; // Pehla din ka price
        int maxProfit = 0;        // Initial profit 0 hai

        for (int i = 1; i < prices.length; i++) {
            // Agar naya minimum milta hai to usko update karo
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Profit calculate karo
                int profit = prices[i] - minPrice;
                // Maximum profit update karo agar naya zyada hai
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
