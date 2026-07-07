class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        beforeArr = [1] * len(nums)
        afterArr = [1] * len(nums)
        for i in range(1, len(nums)):
            beforeArr[i] = nums[i-1] * beforeArr[i-1]
        for i in range(len(nums) - 2, -1, -1):
            afterArr[i] = nums[i+1] * afterArr[i+1]
        res = [1] * len(nums)
        for i in range(len(nums)):
            res[i] = beforeArr[i] * afterArr[i]
        return res