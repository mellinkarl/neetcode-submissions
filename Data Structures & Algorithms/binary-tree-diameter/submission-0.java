/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int longest_diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return longest_diameter;
    }
    /* 
        Returns the height of the current tree
        Updates the longest diameter if higher than current
    */
    public int dfs(TreeNode curr) {
        if (curr == null) {
            return 0;
        }
        int height_left = dfs(curr.left), height_right = dfs(curr.right);
        longest_diameter = Math.max(longest_diameter, height_left + height_right);
        return Math.max(height_left, height_right) + 1;
    }
}
