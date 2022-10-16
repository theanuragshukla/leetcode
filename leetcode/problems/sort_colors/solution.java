class Solution {
    public void sortColors(int[] nums) {
        int p = 0;
        int len = nums.length;
        for(int i=0; i<len;i++){
            if(nums[i]==0){
                int temp = nums[p];
                nums[p++]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                int temp = nums[i];
                nums[i]=nums[p];
                nums[p++]=temp;
            }
        }
    }
}