class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        l = 0
        for r in range(len(prices)):
            curr_profit = prices[r] - prices[l]
            if curr_profit > max_profit:
                max_profit = curr_profit
            elif curr_profit < 0:
                l = r
        return max_profit