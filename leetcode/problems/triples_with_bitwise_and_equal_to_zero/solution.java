
class Solution {
    public int countTriplets(int[] nums) {

        int res = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                int and  =  nums[i]&nums[j] ;
                map.put(and,map.getOrDefault(and,0)+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            for(int i :nums){
                if((key&i)==0)
                    res+=value;
            }
        }

        return res;

    }
}