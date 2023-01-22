class Solution {
    public int[][] sortTheStudents(int[][] nums, int k) {
        int m = nums.length;
        int n = nums[0].length;
        int[] arr = new int[m];
        int[][] ret = new int[m][n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<m; i++){
            arr[i] = nums[i][k];
            map.put(nums[i][k], i);
        }
        
        Arrays.sort(arr);
       
        for(int i = 0; i< m; i++){
            int p = arr[m-i-1];
            int idx = map.get(p);
            ret[i] = nums[idx];
        }
        return ret;
    }
}