class Solution {
    public void rotate(int[] nums, int k) {
        int temp = 0;
        int len = nums.length;
        int[] ans = new int[len];
        for(int i=0;i<len;i++){
            ans[(i+k)%len]=nums[i];
        }
        for(int i=0;i<len;i++)
            nums[i]=ans[i];
    }
}