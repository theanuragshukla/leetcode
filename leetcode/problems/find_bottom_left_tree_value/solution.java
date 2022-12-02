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
    int left = -1;
    int hmax = -1;

    void helper(TreeNode root, int h){
        if(root.left!=null)
            helper(root.left, h+1);
        if(root.left==null && root.right==null){
            if(h>hmax){
                hmax=h;
                left=root.val;
            }
        }
        if(root.right!=null){
            helper(root.right, h+1);
        }


    }
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 0);
        return left;
    }
}