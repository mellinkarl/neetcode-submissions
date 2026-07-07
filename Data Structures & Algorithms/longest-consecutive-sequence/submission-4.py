class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        numsSet = set(nums)
        hashMap = defaultdict(int)
        for num in nums:
            if num in hashMap:
                continue
            if num - 1 not in numsSet:
                i = num
                hashMap[num] += 1
                while i + 1 in numsSet:
                    numsSet.remove(i+1)
                    hashMap[num] += 1
                    i += 1
        return max(hashMap.values())