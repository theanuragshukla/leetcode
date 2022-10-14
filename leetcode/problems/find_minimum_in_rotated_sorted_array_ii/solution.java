class Solution {
    public int findMin(int[] nums) {
        int min= nums[0];
        for(int x:nums)
            min=(x<min)?x:min;
        return min;
    }
}