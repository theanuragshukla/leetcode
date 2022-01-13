class Solution {
    public String longestCommonPrefix(String[] strs) {
        int ttl = strs.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j=0;j<ttl;j++){
                String s = strs[j];
                char cc = 'x';
                if(i<s.length()){
                    cc=s.charAt(i);
                }
                if(cc!=c){
                    return String.valueOf(sb);
                }
            }
            sb.append(c);
        }
        return String.valueOf(sb);
    }
}