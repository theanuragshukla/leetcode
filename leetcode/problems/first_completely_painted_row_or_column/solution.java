class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, Integer> row = new HashMap<>();
        HashMap<Integer, Integer> col = new HashMap<>();
        HashMap<Integer, List<Integer>> nums = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;
        int p = arr.length;
        for(int i = 0; i< m; i++){
            for(int j = 0; j<n; j++){
                int x = mat[i][j];
                nums.put(x, Arrays.asList(i, j));
            }
        }
        
        for(int i = 0; i<p; i++){
            int a = arr[i];
            List<Integer> coord = nums.get(a);
            row.put(coord.get(0), row.getOrDefault(coord.get(0), 0)+1);
            col.put(coord.get(1),col.getOrDefault(coord.get(1), 0)+1);
            int yy = col.get(coord.get(1));
            int xx = row.get(coord.get(0));
 
            if(xx==n)return i;
            if(yy==m)return i;
        }
        return -1;
    }
}