class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int num : nums) {
            hs.add(num);
        }

        int longestSeq = 0;
        for(int val : nums) {
            if(!hs.contains(val - 1)) {
                int count = 1;
                int currVal = val;

                while(hs.contains(currVal + 1)) {
                    count++;
                    currVal++;
                }

                longestSeq = Math.max(longestSeq, count);
            }
        }

        return longestSeq;
    }
}