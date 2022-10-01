class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        s=s.trim();
        int l = s.length();
        while(--l >= 0){
            if(s.charAt(l)!=' '){
                ans++;
            }else{
                return ans;
            }
            }
        
        return ans;
    }
}