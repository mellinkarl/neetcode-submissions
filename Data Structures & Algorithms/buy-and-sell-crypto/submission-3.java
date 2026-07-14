class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curr_min = prices[0];
        for (int p : prices) {
            if (p - curr_min > max) {
                max = p - curr_min;
            }
            curr_min = Math.min(curr_min, p);
        }
        return max;
    }
}
