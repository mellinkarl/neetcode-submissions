class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()
        while n != 1:
            
            # Convert n to sum of squares
            n_str = str(n)
            n = 0
            for c in n_str:
                n += int(c) ** 2
                
            # Hit cycle
            if n in seen:
                return False
            seen.add(n)
        
        # Got to 1
        return True