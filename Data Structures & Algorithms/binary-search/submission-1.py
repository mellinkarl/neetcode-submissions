class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low, high = 0, len(nums) - 1
        while low <= high:
            med = (low + high) // 2
            if nums[med] == target:
                return med
            elif nums[med] < target:
                low = med + 1
            else:
                high = med - 1
        return -1