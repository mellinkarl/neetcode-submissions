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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        recurse(root);
        return root;
    }

    public void recurse(TreeNode curr) {
        if (curr == null) {
            return;
        }
        if (curr.left != null) {
            recurse(curr.left);
        }
        if (curr.right != null) {
            recurse(curr.right);
        }
        TreeNode temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;
        return;
    }
}











