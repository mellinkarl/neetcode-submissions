class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        i, j = 0, 1
        while j < len(prices):
            if prices[j] - prices[i] > profit:
                profit = prices[j] - prices[i]
            elif prices[j] - prices[i] < 0:
                i = j
            else:
                j += 1
        return profit