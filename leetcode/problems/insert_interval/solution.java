class Solution {
    public int[][] insert(int[][] a, int[] b) {
        int n = a.length;
        List<int[]> ret = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> (x[0] - y[0]));
        boolean done = false;
        pq.add(b);

        for (int i = 0; i<n; i++) pq.add(a[i]);
        
        int[] prev = pq.poll();        

        while (!pq.isEmpty()) {             
            int[] curr = pq.poll();
            if (prev[1] >= curr[0]) {
                prev = new int[]{prev[0], Math.max(curr[1], prev[1])};
            } else {
                ret.add(prev);
                prev = curr;
            }
        }
        ret.add(prev);
        int[][] arr = new int[ret.size()][2];
        int k = 0;
        for(int[] p : ret)arr[k++] = p;
        return arr;
    }
}