class Solution {
    public int maxProfit(int[] prices) {
int min = Integer.MAX_VALUE;
        int max = 0, maxp = 0;
        // the approach  is to find the profit and the way tiod
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            // profit is prices[i] -  min and is max from the previous one
            if (prices[i] - min > maxp) {
                maxp = prices[i] - min;
            }
        }
        return maxp;
}
}