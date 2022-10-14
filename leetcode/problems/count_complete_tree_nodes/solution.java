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
    void count(TreeNode root){
        if(root==null){
            return;
        }
        ans++;
       count(root.left);
        count(root.right);
        return;
    }
    public int countNodes(TreeNode root) {
        count(root);
        return ans;
    }
}