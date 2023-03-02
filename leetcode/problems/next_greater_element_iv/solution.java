class Solution {
    public int[] secondGreaterElement(int[] nums) {
        Stack<Integer> s = new Stack<>();
        PriorityQueue<int[]> t = new PriorityQueue<>((i,j) -> (i[0] - j[0]));
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            while(!t.isEmpty() && t.peek()[0] < nums[i]){
                int[] b = t.poll();
                ans[b[1]] = nums[i];  
            }
            while(!s.isEmpty() && nums[s.peek()] < nums[i]){
                int in = s.pop();
                t.add(new int[]{nums[in],in});
            }
            s.push(i);
        }
        return ans;
    }
}