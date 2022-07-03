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
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int height = getTreeHeight(root);
        if(height == 0) {
            return 1;
        }
        
        //getting node count for upper half of the tree
        int upperCount = (int)Math.pow(2, height) -1;
        
        //getting node count for the last level of the tree
        int left = 0; int right = upperCount;
        
        while(left < right){
            int indexToFind = (int) Math.ceil((left+right)/2d);
            
            if(nodeExists(indexToFind, height, root)) {
                left = indexToFind;
            } else {
                right = indexToFind - 1;
            }
            
        }
        
        //addding one because index of last level tree array starts at 0
        return upperCount + left + 1;
    }
    
    
    private int getTreeHeight(TreeNode root) {
        int height = 0;
        
        while(root.left != null){
            root = root.left;
            height++;
        }
        
        return height;
    }
    
    private boolean nodeExists(int indexToFind, int height, TreeNode node) {
        int left = 0; int right = (int)Math.pow(2, height) -1;
        int count = 0;
        
        while(count < height){
            int mid = (int) Math.ceil((left+right)/2d);

            if(indexToFind >= mid) {
                left = mid;
                node = node.right;
            } else {
                right = mid - 1;
                node = node.left;
            }
            
            count++;
        }
        
        return node != null;
    }
    
}