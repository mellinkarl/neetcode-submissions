class Solution {
    public boolean isValidSudoku(char[][] board) {
    
        // Rows
        for (char[] row : board) {
            Set<Integer> seen = new HashSet<>();
            for (char c : row) {
                if (c == '.') {
                    continue;
                }
                int num = c - '0';
                if (seen.contains(num)) {
                    return false;
                }
                seen.add(num);
            }
        }


        // Columns
        for (int i = 0; i < board[0].length; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                int num = board[j][i] - '0';
                if (seen.contains(num)) {
                    return false;
                }
                seen.add(num);
            }
        }

        // Squares
        Map<Integer, HashSet<Integer>> squares = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int square = (i / 3) * 3 + (j / 3);
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0';
                if (squares.containsKey(square)) {
                    HashSet<Integer> squareSet = squares.get(square);
                    if (squareSet.contains(num)) {
                        return false;
                    }
                    squareSet.add(num);
                }
                else {
                    squares.put(square, new HashSet<>(Set.of(num)));
                }
            }
        }
        return true;
    }
}
