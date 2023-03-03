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
    public TreeNode createBinaryTree(int[][] des) {
        HashMap<Integer, Boolean> res = new HashMap<>();
        HashMap<Integer, TreeNode> m = new HashMap<>();
        int n = des.length;
        for(int i = 0; i< n; i++){
               int x = des[i][0];
               int y = des[i][1];
               int z = des[i][2];
            TreeNode p = m.getOrDefault(x, new TreeNode(x));
            TreeNode q = m.getOrDefault(y, new TreeNode(y));
            if(z==1){
                p.left = q;
            }else{
                p.right=q;
            }
            m.put(x, p);
            m.put(y, q);
            if(!res.containsKey(x))res.put(x, true);
            res.put(y, false);
            }
       for(int x : res.keySet()){
            if(res.get(x))return m.get(x);
        } 
        return m.get(0);
        }
      
    }