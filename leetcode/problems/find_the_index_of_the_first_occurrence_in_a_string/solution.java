class Solution {
    boolean validIdx(int idx, char[] arr1, char[] arr2){
        for(int i = 0;i<arr2.length;i++){
            if(arr2[i]!=arr1[idx+i]){
                return false;
            }
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        char[] arr1 = haystack.toCharArray();
        char[] arr2 = needle.toCharArray();
        int ans = -1;
        if(arr1.length<arr2.length)
            return ans;
       
        for(int i = 0;i<=arr1.length-arr2.length;i++){
            if(arr1[i]==arr2[0]){
                if(validIdx(i,arr1,arr2)){
                    ans=i;
                    break;
                }
            }
        }
        return ans;
    }
}