class Solution:
    def maxArea(self, heights: List[int]) -> int:
        high, i, j = 0, 0, len(heights) - 1
        while i < j:
            if min(heights[i], heights[j]) * (j - i) > high:
                high = min(heights[i], heights[j]) * (j - i)
            elif heights[i] < heights[j]:
                i += 1
            else:
                j -= 1
        return high
