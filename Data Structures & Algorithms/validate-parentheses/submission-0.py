class Solution:
    def isValid(self, s: str) -> bool:
        pairs = {")": "(", "]": "[", "}": "{"}
        stack = []
        for c in s:
            if c in pairs.values():
                stack.append(c)
            else:
                if stack and stack[-1] == pairs[c]:
                    stack.pop()
                else:
                    return False
        return not stack
