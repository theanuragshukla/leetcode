class Solution {
    public int minDeletionSize(String[] strs) {
        int len = strs[0].length();
        int sz = strs.length;
        int ans=0;
        for(int i = 0; i<len;i++){
            for(int j = 0; j< sz-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}