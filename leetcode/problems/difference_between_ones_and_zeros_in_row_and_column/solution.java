class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] diff = new int[m][n];
        HashMap<Integer, ArrayList<Integer>> map  = new HashMap<>();
        for(int i =0; i< n;i++){
            int zerosCol = 0;
            int onesCol = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int p = 0; p<m;p++){
                if(grid[p][i]==0){
                    zerosCol++;
                }else{
                    onesCol++;
                }
            }
            arr.add(zerosCol);
            arr.add(onesCol);
            map.put(i, arr);
        }
        for(int i = 0; i<m;i++){
            int onesRow = 0;
            int zerosRow = 0;
            for(int j = 0;j<n;j++){
                if(grid[i][j]==0){
                    zerosRow++;
                }else{
                    onesRow++;
                }
            }
            for(int j = 0; j< n ; j++){
                diff[i][j] = onesRow + map.get(j).get(1) - zerosRow - map.get(j).get(0);
            }

        }
        return diff;
    }
}