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
    public boolean isValidBST(TreeNode root) {
        Deque<Object[]> queue = new ArrayDeque<>();
        queue.offer(new Object[]{root, Long.MIN_VALUE, Long.MAX_VALUE});
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Object[] elem = queue.poll();
                TreeNode node = (TreeNode) elem[0];
                long value = (long) node.val;
                long low = (long) elem[1];
                long high = (long) elem[2];
                if (value <= low || value >= high) {
                    return false;
                }
                if (node.left != null) {
                    queue.offer(new Object[]{node.left, low, value});
                }
                if (node.right != null) {
                    queue.offer(new Object[]{node.right, value, high});
                }
            }
        }
        return true;
    }
}
