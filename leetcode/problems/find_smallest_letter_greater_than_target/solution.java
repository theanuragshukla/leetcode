class Solution {
    public char nextGreatestLetter(char[] arr, char ch) {
        if(arr[0]>ch){
            return arr[0];
        }
        if(arr[arr.length-2]<=ch && arr[arr.length-1]>ch){
            return arr[arr.length-1];
        }
        int min = 1;
        int max = arr.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(arr[mid]>ch){
                if(arr[mid-1]<=ch)
                return arr[mid];
                else{
                    max=mid;
                    continue;
                }
            }else{
                min=mid+1;
            }
        }
        return arr[0];
    }
}