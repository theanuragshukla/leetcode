class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int left = 0;
        int right = 0;
        int len = 0;
        int stringLength = s.length();
        while(right<stringLength){ 
           char lc = s.charAt(right);
           if(map.containsKey(lc))
              left = Math.max(map.get(lc)+1,left);
            map.put(lc,right);
            len=Math.max(len,(right-left+1));
            right++;
        }
        return len;
    }
}