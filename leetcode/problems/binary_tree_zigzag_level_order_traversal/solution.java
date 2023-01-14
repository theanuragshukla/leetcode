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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root==null)return ret;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(s1.size()!=0 || s2.size()!=0){
            List<Integer> arr = new ArrayList<>();
            Stack<TreeNode> st = s1.size()==0 ? s2 : s1;
            Stack<TreeNode> s3 = s1.size()==0 ? s1 : s2;
            int sz = st.size();
            while(sz-- > 0){
            TreeNode temp = st.pop();
            if(s3==s2){
            if(temp.left!=null)s3.push(temp.left);
            if(temp.right!=null)s3.push(temp.right);
            }else{
            if(temp.right!=null)s3.push(temp.right);
            if(temp.left!=null)s3.push(temp.left);
            }arr.add(temp.val);
            }
            ret.add(arr);
        }
        return ret; 
    }
}