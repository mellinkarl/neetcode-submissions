class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = Counter(nums)
        heap = [(-n, v) for v, n in counts.items()]
        heapq.heapify(heap)
        res = []
        while k > 0:
            res.append(heapq.heappop(heap)[1])
            k -= 1
        return res