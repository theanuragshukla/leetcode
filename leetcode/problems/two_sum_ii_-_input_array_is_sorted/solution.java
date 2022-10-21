class Solution {
    public int[] twoSum(int[] nums, int t) {
        int min = 0;
        int max = nums.length-1;
        while(min<max){
            int temp = nums[min] + nums[max];
            if(temp == t){
                int[] ret = {min+1, max+1};
                return ret;
            }
            if(temp < t){
                min++;
            }else{
                max--;
            }
        }
        return nums;
    }
}