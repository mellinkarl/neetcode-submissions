class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = defaultdict(int)
        freq = [[] for i in range(len(nums) + 1)]
        for num in nums:
            count[num] += 1

        for n, c in count.items():
            freq[c].append(n)

        res = []
        end = len(freq) - 1
        while k > 0:
            for n in freq[end]:
                res.append(n)
            k -= len(freq[end])
            end -= 1

        return res
