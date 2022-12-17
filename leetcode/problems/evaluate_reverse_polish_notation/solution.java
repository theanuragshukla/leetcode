class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i = 0; i< n ; i++){
            String s = arr[i];
            if(s.length()==1){
                char ch = s.charAt(0);
                if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                    int n2 = Integer.valueOf(st.pop());
                    int n1 = Integer.valueOf(st.pop());
                    switch(ch){
                        case '+':
                            st.push(n1+n2);
                            break;
                        case '-':
                            st.push(n1-n2);
                            break;
                        case '*':
                            st.push(n1*n2);
                            break;
                        case '/':
                            st.push(n1/n2);
                            break;
                    }
                }
                else
                st.push(Integer.valueOf(s));
            }else{
                st.push(Integer.valueOf(s));
            }
    }
    return Integer.valueOf(st.pop());
}
}