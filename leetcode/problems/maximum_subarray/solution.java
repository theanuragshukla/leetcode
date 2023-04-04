class Solution {
      int kadane(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        if (max < 0) {
            return max;
        }
        int maxSoFar = -99999999;
        int maxEndingHere = 0;
        for (int i: arr){
            maxEndingHere = maxEndingHere + i;
            maxEndingHere = Integer.max(maxEndingHere, 0);
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
 
    public int maxSubArray(int[] nums) {
        return kadane(nums);
    }
}