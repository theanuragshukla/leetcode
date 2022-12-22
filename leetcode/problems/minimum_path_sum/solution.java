class Solution {
    public int minPathSum(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      int[][] dp = new int[m][n];
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          int min =  Integer.MAX_VALUE;
          if (i != 0) 
            min = Math.min(min, dp[i-1][j]);
          if (j != 0) 
            min = Math.min(min, dp[i][j-1]);
          dp[i][j] = grid[i][j] + (min != Integer.MAX_VALUE ? min : 0);
        }
      }
      return dp[m-1][n-1];
    }
}