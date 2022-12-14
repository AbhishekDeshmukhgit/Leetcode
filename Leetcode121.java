class Solution {
    public int maxProfit(int[] prices) {
    int minimum = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            minimum = Math.min(minimum, prices[i]);
            profit = Math.max(profit, prices[i] - minimum);
        }
        return profit;
    }
}