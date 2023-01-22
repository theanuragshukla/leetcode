class Solution {
    public int alternateDigitSum(int n) {
        int len = String.valueOf(n).length();
        int s = 1;
        int ans = 0;
        
        char[] arr = String.valueOf(n).toCharArray();
        
        for(int i  = 0; i< len; i++){
            ans+=s*(arr[i]-48);
            s*=-1;
        }
        return ans;
    }
}