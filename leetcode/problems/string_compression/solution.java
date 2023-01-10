class Solution {
    public int compress(char[] chars) {
        int n = chars.length; 
        int j = 0;
        for(int i = 0;i<n;i++){
        int count = 1; 
           while(i<n-1 && chars[i]==chars[i+1]){
               i++;
               count++;
           }
           chars[j++] = chars[i];
           if(count > 1){
               char[] arr = String.valueOf(count).toCharArray();
               for(char c : arr){
                   chars[j++] = c;
               }
           }
        }

        return j;
    }
}

