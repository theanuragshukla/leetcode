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
    int sum(TreeNode root, String s){
        if(root==null)return 0;
        s=s+String.valueOf(root.val);
        if(root.left==null && root.right==null){
            return Integer.valueOf(s);
        }
        return sum(root.left, s)+sum(root.right, s);
    }
    public int sumNumbers(TreeNode root) {
       return sum(root, ""); 
    }
}