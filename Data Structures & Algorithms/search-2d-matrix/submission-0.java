class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lRow = 0, rRow = matrix.length - 1;
        int lCol = 0, rCol = matrix[0].length - 1;
        while (lRow <= rRow && lCol <= rCol) {
            int[] mid = new int[]{lRow + (rRow - lRow) / 2, lCol + (rCol - lCol) / 2};
            int midVal = matrix[mid[0]][mid[1]];
            if (midVal == target) {
                return true;
            }
            if (target < matrix[mid[0]][0]) {
                rRow = mid[0] - 1;
            }
            else if (target > matrix[mid[0]][matrix[0].length - 1]) {
                lRow = mid[0] + 1;
            }
            else if (target < matrix[mid[0]][mid[1]]) {
                rCol = mid[1] - 1;
            }
            else {
                lCol = mid[1] + 1;
            }
        }
        return false;
    }
}
