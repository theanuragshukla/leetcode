class Solution {
    public int[] plusOne(int[] arr) {
        int carry = 1;
        for(int i = arr.length-1;i>=0;i--){
            int sum = arr[i]+carry;
            carry=sum/10;
            arr[i]=sum%10;
        }
        if(carry!=0){
            int[] ret = new int[arr.length+1];
            ret[0]=carry;
            for(int i=0;i<arr.length;i++){
                ret[i+1]=arr[i];
            }
            return ret;
        }
        return arr;
    }
}