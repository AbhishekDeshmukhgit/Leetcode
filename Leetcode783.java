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

    int min=Integer.MAX_VALUE;
          TreeNode prev;
    public int minDiffInBST(TreeNode root) {
        inorderTraversal(root);
        return min;
    }
    public void inorderTraversal(TreeNode root) {
        
        if(root!=null)
        {
            inorderTraversal(root.left);
            if(prev!=null){
            min=Math.min(min,Math.abs(prev.val-root.val));
                         }
           prev=root;
            inorderTraversal(root.right);
        }
    }
}