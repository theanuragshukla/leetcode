class Solution {
    public int[] findErrorNums(int[] nums) {
       HashMap<Integer, Integer> m = new HashMap<>();
        int[] ret = new int[2];
        int sum = 0;
        for(int i = 0; i< nums.length;i++){
            if(m.containsKey(nums[i])){
                ret[0]=nums[i];
            }
            m.put(nums[i], i);
            sum+=nums[i];
        }
        int len = nums.length;
        ret[1] = (len*(len+1)/2) - sum + ret[0];
        return ret;
    }
}