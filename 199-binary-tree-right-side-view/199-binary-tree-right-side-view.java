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
    public List<Integer> rightSideView(TreeNode root) {
        return  rightSideViewBFS(root);
    }
    
    public List<Integer> rightSideViewBFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0) {
            int length = queue.size();
            int count = 0;

            while (count < length) {
                TreeNode n = queue.poll();
                if(n.left != null) {
                    queue.add(n.left);
                }

                if(n.right != null) {
                    queue.add(n.right);
                }
                count++;

                if(count == length) {
                    result.add(n.val);
                }
            }
        }

        return result;
    }
}