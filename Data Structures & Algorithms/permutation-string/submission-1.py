class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        s1_freq, s2_freq, n, m = [0] * 26, [0] * 26, len(s1), len(s2)
        if n > m:
            return False

        for i in range(len(s1)):
            s1_freq[ord(s1[i]) - ord('a')] += 1
            s2_freq[ord(s2[i]) - ord('a')] += 1

        if s1_freq == s2_freq:
            return True

        for right in range(len(s1), len(s2)):
            s2_freq[ord(s2[right - n]) - ord('a')] -= 1
            s2_freq[ord(s2[right]) - ord('a')] += 1
            if s1_freq == s2_freq:
                return True
                
        return False
