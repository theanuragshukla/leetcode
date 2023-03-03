class Solution {
    public int majorityElement(int[] nums) {
       int[] ret = {0, 0}; 
        for(int x : nums){
            if(ret[1]>0){
                ret[1]+=ret[0]==x?1:-1;
            }else{
                ret[0] = x;
                ret[1] = 1;
            }
        }
        return ret[0];
    }
}