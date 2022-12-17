class Solution {
    public String reverseWords(String s) {
        s= s.trim();
       String[] arr = s.split(" ");
       int n = arr.length;
       for(int i = 0 ; i< n/2; i++){
           String temp = arr[i];
           arr[i] = arr[n-1-i];
           arr[n-1-i] = temp;
       }
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i< n-1; i++){
           if(arr[i].length()!=0)
           sb.append(arr[i]+" ");
       }
       sb.append(arr[n-1]);
       return sb.toString();
    }
}