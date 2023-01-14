class Solution {
    private List<Integer> arr = new ArrayList<>();
    private void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    private void goSwap(TreeNode root, int a, int b){
        if(root==null)return;
        if(root.val==a)root.val=b;
        else if(root.val==b)root.val=a;
        goSwap(root.right, a, b);
        goSwap(root.left, a, b);
    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        int pos = 0;
        int[] rev = new int[2];

        for(int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) > arr.get(i+1)) {
                rev[pos++] = arr.get(i);
                break;
            }
        }

        for(int i = arr.size()-1; i > 0; i--) {
            if (arr.get(i) < arr.get(i-1)) {
                rev[pos++] = arr.get(i);
                break;
            }
        }
        goSwap(root, rev[0], rev[1]);
    }
}