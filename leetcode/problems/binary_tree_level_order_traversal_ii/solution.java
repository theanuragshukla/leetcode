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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        Stack<List<Integer>> st = new Stack<>();
        if(root==null)return ret;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            List<Integer> arr = new ArrayList<>();
            int sz = q.size();
            while(sz-- > 0){
            TreeNode temp = q.remove();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            arr.add(temp.val);
            }
            st.push(arr);
        }
        while(!st.isEmpty()){
            ret.add(st.pop());
        }
        return ret; 
    }
}