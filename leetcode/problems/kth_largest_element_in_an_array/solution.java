class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b)->(Integer.compare(b, a)));
        for(int x:nums)q.add(x);
        int x = 0;
        while(k-->0)x=q.poll();
        return x;
    }
}