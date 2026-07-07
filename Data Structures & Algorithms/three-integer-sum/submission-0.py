class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        seen = set()
        nums.sort()
        for i in range(len(nums) - 1):
            j, k = i + 1, len(nums) - 1
            while j < k:
                total = nums[i] + nums[j] + nums[k]
                if total == 0:
                    if (nums[i], nums[j], nums[k]) not in seen:
                        res.append([nums[i], nums[j], nums[k]])
                        seen.add((nums[i], nums[j], nums[k]))
                    j += 1
                    k -= 1
                elif total < 0:
                    j += 1
                else:
                    k -= 1
        return res
                
