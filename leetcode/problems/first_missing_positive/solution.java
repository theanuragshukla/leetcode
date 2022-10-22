class Solution {
    public int firstMissingPositive(int[] nums) {
      Arrays.sort(nums);
        int prev = 0;
      for(int i = 0 ; i< nums.length;i++){
          if(nums[i]<=0)continue;
          if(nums[i]-prev>1){
              return(prev+1);
          }
          prev=nums[i];
      }
        return (prev+1);
    }
}