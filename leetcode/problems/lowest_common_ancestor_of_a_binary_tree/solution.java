/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null|| root==p || root==q){
            return root;
        }

        TreeNode p1 = lowestCommonAncestor(root.left, p, q);
        TreeNode p2 = lowestCommonAncestor(root.right, p, q);
        
        if(p1==null || p2==null){
            if(p1==null && p2==null){
                return null;
            }else{
                if(p1==null)return p2;
                if(p2==null)return p1;
            }
        }else{
            return root;
        }
        
        return null;
    }
}