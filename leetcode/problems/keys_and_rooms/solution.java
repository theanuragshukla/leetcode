class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int count = 1;
        while (st.size() > 0)
            for (int k : rooms.get(st.pop()))
                if (!visited[k]) {
                    st.push(k);
                    visited[k] = true;
                    count++;
                }
        return n == count;
    }
}
