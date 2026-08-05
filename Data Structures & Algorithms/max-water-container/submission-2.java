class Solution {
    public int maxArea(int[] heights) {
        int maxHeight = 0;
        int leftPtr = 0, rightPtr = heights.length - 1;
        while (leftPtr < rightPtr) {
            maxHeight = Math.max(maxHeight, 
                        Math.min(heights[leftPtr], heights[rightPtr])
                        * (rightPtr - leftPtr));
            if (heights[leftPtr] > heights[rightPtr]) {
                rightPtr--;
            }
            else {
                leftPtr++;
            }
        }
        return maxHeight;
    }
}
