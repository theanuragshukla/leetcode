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
    int pos = 0;
    private TreeNode makeTree(int[] in, int[] po, int start, int end){
        if(start>end)return null;
        int k = po[pos--];
        TreeNode root = new TreeNode(k);
        if(start==end){
            return root;
        }
        int idx = -1;
        for(int i = start; i<=end; i++){
            if(in[i]==k){
                idx=i;
                break;
            }
        }
        root.right = makeTree(in, po, idx+1, end);
        root.left = makeTree(in, po, start, idx - 1);
        return root;
    }
    public TreeNode buildTree(int[] in, int[] po) {
        pos=po.length-1;
        return makeTree(in, po,0,  po.length-1);
    }
}