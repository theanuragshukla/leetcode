class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[end]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return nums[end];
    }
}