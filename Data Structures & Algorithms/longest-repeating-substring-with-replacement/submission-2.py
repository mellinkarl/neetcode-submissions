class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        counts = defaultdict(int)
        res = 0
        for right in range(len(s)):
            counts[s[right]] += 1
            while sum(counts.values()) - max(counts.values()) > k:
                counts[s[left]] -= 1
                left += 1
            res = max(res, right - left + 1)
        return res


