class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] ret = new int[2];
       HashMap<Integer, Integer> m= new HashMap<>();
       for(int i = 0; i< nums.length; i++){
           if(m.containsKey(nums[i])){
               ret[0] = m.get(nums[i]);
               ret[1] = i;
               return ret;
           }
           m.put(target-nums[i], i);
       } 
       return ret;
    }
}