class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length, k = 0, count = 0;
        int[] arr = new int[m*n];

        for(int[] i : grid) {
            for(int j : i) {
                arr[k++] = j;
            }
        }
        Arrays.sort(arr);
        for(int i : arr) {
            if((i - arr[k/2]) % x != 0) return -1;

            count += Math.abs(i - arr[k/2]) / x;
        }

        return count;
    }
}