class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> m = new HashMap<Character, Character>();
        m.put('(',')');
        m.put('[',']');
        m.put('{','}');
        
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for(char c1 : ch){
            if(m.containsKey(c1)){
                st.push(c1);
            }else{
                if(st.isEmpty() || m.get(st.pop())!=c1){
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}