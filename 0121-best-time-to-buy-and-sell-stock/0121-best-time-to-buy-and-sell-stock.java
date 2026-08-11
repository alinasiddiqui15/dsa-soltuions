class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int max = 0;

        for(int i=0; i<n; i++){
            int diff = prices[i] - min;
            min = Math.min(min, prices[i]);
            max = Math.max(max, diff);
        }
        return max;
    }
}