class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> x = new HashSet<Integer>();
        HashSet<Integer> y = new HashSet<Integer>();
        int n = matrix.length;int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==0){
                    x.add(i);
                    y.add(j);
                }
            }
        }
        System.out.println(x);
        System.out.println(y);
        for(int p : x){
            Arrays.fill(matrix[p], 0);
         }
        for(int q : y){
            for(int i=0;i<n;i++){
                matrix[i][q]=0;
            }
        }
    }
}