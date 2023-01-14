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
    private TreeNode makeTree(int[] pre, int[] in, int start, int end){
        if(start>end)return null;
        if(start==end){
            pos++;
            return new TreeNode(in[start]);
        }
        int k = pre[pos++];
        TreeNode root = new TreeNode(k);
        int idx = -9;
        for(int i = start; i<=end; i++){
            if(in[i]==k){
                idx = i;
                break;
            }
        }
        root.left = makeTree(pre, in, start, idx-1);
        root.right = makeTree(pre, in, idx+1, end);
        return root;

    }
    public TreeNode buildTree(int[] pre, int[] in) {
        return makeTree(pre, in, 0, pre.length-1);
    }
}