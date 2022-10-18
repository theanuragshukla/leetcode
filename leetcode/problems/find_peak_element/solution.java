class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int min = 1;
        int max = len-1;
        if(len==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[len-1]>nums[len-2]){
            return len-1;
        }
        while(min<=max){
            int mid=(min+max)/2;
            if(nums[mid]<nums[mid-1]){
                max=mid;
            }else if(nums[mid]<nums[mid+1]){
                min=mid;
            }else{
                return mid;
            }
        }
        return -1;
    }
}