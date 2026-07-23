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
    int res = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return res;
    }
    public void dfs(TreeNode curr, int curr_max) {
        if (curr == null) {
            return;
        }
        if (curr.val >= curr_max) {
            res++;
            curr_max = curr.val;
        }
        dfs(curr.left, curr_max);
        dfs(curr.right, curr_max);
    }
}
