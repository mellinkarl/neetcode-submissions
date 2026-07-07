class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        maxLen = 0
        seen = set()
        i = 0
        for j in range(len(s)):
            while s[j] in seen:
                seen.remove(s[i])
                i += 1
            seen.add(s[j])
            maxLen = max(maxLen, j - i + 1)
        return maxLen
            
