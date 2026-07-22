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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }
    public boolean dfs(TreeNode x, TreeNode y) {
        if (x == null && y == null) {
            return true;
        }
        if (x == null || y == null || x.val != y.val) {
            return false;
        }
        boolean left = dfs(x.left, y.left);
        boolean right = dfs(x.right, y.right);
        if (!left || !right) {
            return false;
        }
        return true;
    }
}
