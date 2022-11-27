class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        for(int num:nums){
            System.out.println(num);
        }
        int n = nums.length;
        int j = n-1;
        int i = 0;
        while(i<j){
            int sum = nums[i] + nums[j];
            if(sum < k){
                i++;
            }else if(sum > k){
                j--;
            }else{
                ans++;
                i++;
                j--;
            }
        }
     return ans;  
    }
}