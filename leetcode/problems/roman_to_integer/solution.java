class Solution {
    public int romanToInt(String s) {
        ArrayList<Character> arr = new ArrayList<Character>();
        arr.add('I');
        arr.add('V');
        arr.add('X');
        arr.add('L');
        arr.add('C');
        arr.add('D');
        arr.add('M');
        int ans=0;
        int[] nums={1,5,10,50,100,500,1000};
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            char next='I';
            if(i!=s.length()-1){
                next=s.charAt(i+1);
            }
            if(arr.indexOf(curr)<arr.indexOf(next)){
                ans-=nums[arr.indexOf(curr)];
            }else{
                ans+=nums[arr.indexOf(curr)];
            }
        }
        return ans;
    }
}