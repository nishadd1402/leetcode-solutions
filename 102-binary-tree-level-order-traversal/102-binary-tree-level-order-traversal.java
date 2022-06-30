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
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0) {

            int l = queue.size();
            int count = 0;
            List<Integer> subArray = new ArrayList<>();
            while (count < l) {
                TreeNode n = queue.poll();
                subArray.add(n.val);
                if(n.left != null) {
                    queue.add(n.left);
                }

                if(n.right != null) {
                    queue.add(n.right);
                }
                count++;
            }

            result.add(subArray);
        }

        return result;
    }
}