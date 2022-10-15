class Solution {
    int bsearch(int[] arr, int k, int min, int max){
        if(min==max){
            if(arr[min]==k)
                return min;
            return -1;
        }
        int mid = (min+max)/2;
        if(arr[mid]==k){
            return mid;
        }else if(arr[mid]<k){
            return bsearch(arr, k, mid+1, max);
        }else{
            return bsearch(arr, k, 0, mid);
        }
    }
    public int search(int[] nums, int target) {
        return bsearch(nums, target, 0, nums.length-1);
    }
}