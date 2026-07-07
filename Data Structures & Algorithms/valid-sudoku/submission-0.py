class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        squares = defaultdict(set)
        rows = defaultdict(set)
        cols = defaultdict(set)
        for i in range(len(board)):
            for j in range(len(board)):
                if board[i][j] == ".":
                    continue
                num = int(board[i][j])
                if num in rows[i] or num in cols[j] or num in squares[(i // 3, j // 3)] or num > 9 or num < 1:
                    return False
                cols[j].add(num)
                rows[i].add(num)
                squares[(i // 3, j // 3)].add(num)
        return True

            
