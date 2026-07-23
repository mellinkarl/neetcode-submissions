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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        int index = 0;
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        Deque<TreeNode> queue = new LinkedList<>(List.of(root));
        queue.addLast(null);
        while (!queue.isEmpty()) {
            TreeNode elem = queue.poll();
            if (elem == null) {
                if (queue.peek() != null) {
                    queue.addLast(null);
                    res.add(new ArrayList<>());
                    index++;
                    continue;
                }
                else {
                    return res;
                }
            }
            res.get(index).add(elem.val);
            if (elem.left != null) {
                queue.addLast(elem.left);
            }
            if (elem.right != null) {
                queue.addLast(elem.right);
            }
        }
        return res;
    }
}
