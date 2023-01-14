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
    int p = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root!=null){
        int r1 = kthSmallest(root.left, k);
        if(r1!=-1)return r1;
        p++;
        if(p==k)return root.val;
        int r2 = kthSmallest(root.right, k);
        if(r2!=-1)return r2;
    }
    return -1;
    }
}