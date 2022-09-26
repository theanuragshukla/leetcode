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
    void treeRead(List<Integer> ret,TreeNode root){
        if(root==null){
            return;
        }
          treeRead(ret , root.left);
      
        ret.add(root.val);    
        treeRead(ret, root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        treeRead(ret, root);
        return ret;
    }
}