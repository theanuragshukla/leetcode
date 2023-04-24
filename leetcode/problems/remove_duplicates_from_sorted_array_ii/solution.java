class Solution {
    public int removeDuplicates(int[] nums) {
        int pidx = 0;
        int count = 1;
        int n = nums.length;
        for(int i = 1; i<n; i++){
            if(nums[i]==nums[pidx]){
                if(count<2){
                nums[++pidx]= nums[i];
                    count++;
                }else{
                    nums[pidx]=nums[i];
                }
            }else{
                nums[++pidx]= nums[i];
                count=1;
            }
        }
        return pidx+1;
    }
}