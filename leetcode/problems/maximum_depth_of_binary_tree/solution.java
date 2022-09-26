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
    int ans=0;
    void read(TreeNode root, int h){
        if(root==null){
            ans=h>ans?h:ans; 
            return;
        }
        read(root.left, h+1);
        read(root.right, h+1);
        
    }
    public int maxDepth(TreeNode root) {
        read(root, 0);
        return ans;
    }
}