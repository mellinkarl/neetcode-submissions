import re
class Solution:
    def isPalindrome(self, s: str) -> bool:
        lowerCase = (re.sub(r'[^a-zA-Z0-9]', '', s)).lower()
        i, j = 0, len(lowerCase) - 1
        while i < j:
            if lowerCase[i] != lowerCase[j]:
                return False
            i += 1
            j -= 1
        return True