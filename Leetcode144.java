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
    private List<Integer> l=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        Traversal(root);
        return l;
    }
    private void Traversal(TreeNode node)
    {
        if(node==null)
        {
            return ;
        }
        l.add(node.val);
        Traversal(node.left);
        Traversal(node.right);

    }

}