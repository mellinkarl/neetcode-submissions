class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums_set = set(nums)
        longest = 0
        for num in nums:
            if num - 1 not in nums_set:
                temp_num = num
                curr_len = 1
                while temp_num + 1 in nums_set:
                    curr_len += 1
                    temp_num += 1
                longest = max(longest, curr_len)
        return longest