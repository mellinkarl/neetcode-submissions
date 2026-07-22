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
    public boolean isBalanced(TreeNode root) {
        int res = dfs(root);
        return res != -1;
    }
    public int dfs(TreeNode curr) {
        if (curr == null) {
            return 0;
        }
        int left_len = dfs(curr.left);
        int right_len = dfs(curr.right);
        if (left_len == -1 || right_len == -1 || Math.abs(left_len - right_len) > 1) {
            return -1;
        }
        return Math.max(left_len, right_len) + 1;
    }
}
