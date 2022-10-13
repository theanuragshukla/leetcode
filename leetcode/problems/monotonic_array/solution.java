class Solution {
    public boolean isMonotonic(int[] nums) {
        int diff = 0;
        boolean flag = false;
        for(int i = 0; i< nums.length-1;i++)
        {
            if(diff!=0){
                break;
            }
            diff=nums[i]-nums[i+1];
        }           
        if(diff==0)return true;
        flag=diff>=0;
        
        for(int i=0;i<nums.length-1;i++){
            if(diff*(nums[i]-nums[i+1])<0)return false;
        }
        return true;
    }
}