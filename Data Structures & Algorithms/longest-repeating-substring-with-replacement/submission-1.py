class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        maxLen = 0
        counts = defaultdict(int)
        i = 0
        for j in range(len(s)):
            counts[s[j]] += 1
            if (j - i + 1) - max(counts.values()) > k:
                counts[s[i]] -= 1
                i += 1
            maxLen = max(maxLen, j - i + 1)

        return maxLen