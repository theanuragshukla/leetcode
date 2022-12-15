class Solution {
    private HashMap<Integer, Boolean> m = new HashMap<>();
    private int hash(int a, int b){
        return (a+b)*(a+b+1)/2 + a;
    }
   boolean traverse(char[][] grid, int i, int j, String path){
       if(i>=grid.length || j>=grid[0].length){
           return false;
       }
        int key = hash(path.hashCode(), hash(i, j));
        if(m.containsKey(key)){
            return m.get(key);
        }
       char ch = grid[i][j];
       if(ch=='('){
           path = path + ch;
       }else{
           if(path.length()==0){
               return false;
           }
           if(path.charAt(path.length()-1)!='('){
               return false;
           }
           path = path.substring(0, path.length()-1);
       }
       if(i==grid.length-1 && j==grid[0].length-1){
           return path.length()==0;
       }
     boolean res =  (traverse(grid, i+1, j, path+"") || traverse(grid, i, j+1, path+""));
     m.put(key, res);
     return res;
    }
    public boolean hasValidPath(char[][] grid) {
        return traverse(grid, 0, 0, "");
    }
}