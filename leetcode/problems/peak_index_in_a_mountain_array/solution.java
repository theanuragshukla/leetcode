class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int min = 1;
        int max = arr.length-1;
       while(min<=max){
           int mid = (min+max)/2;
           if(arr[mid]<arr[mid-1]){
               max=mid;
           }else if(arr[mid]<arr[mid+1]){
               min=mid;
           }else{
               return mid;
           }
           
        }
        return -1;
    }
}
