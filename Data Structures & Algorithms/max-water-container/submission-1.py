class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left, right = 0, len(heights) - 1
        max_water = -1
        while left < right:
            min_height = min(heights[left], heights[right])
            max_water = max(max_water, min_height * (right - left))
            if heights[left] == min_height:
                left += 1
            else:
                right -= 1
        return max_water

