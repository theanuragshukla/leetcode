class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st= new Stack();
        int n=temp.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            while(st.size()>0 && temp[i]>temp[st.peek()])
                ans[st.peek()]=i-st.pop();
            st.push(i);
        }
        return ans;
    }
}