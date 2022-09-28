class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        
        for(int x : nums){
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }else{
                m.put(x,1);
            }
        }
        int max = 0;
        int ans=0;
        for(Integer i : m.keySet()){
            if(m.get(i)>max){
                max=m.get(i);
                ans=i;
            }
            
        }
        return ans;
    }
}