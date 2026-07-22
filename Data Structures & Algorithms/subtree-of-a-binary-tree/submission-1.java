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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root, subRoot);
    }
    public boolean dfs(TreeNode curr, TreeNode subRoot) {
        if (curr == null) {
            return false;
        }
        if (curr.val == subRoot.val) {
            if (is_subtree(curr, subRoot)) {
                return true;
            }
        }
        return dfs(curr.left, subRoot) || dfs(curr.right, subRoot);
    }

    public boolean is_subtree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        boolean left = is_subtree(root1.left, root2.left);
        boolean right = is_subtree(root1.right, root2.right);
        return left && right;
    }
}
