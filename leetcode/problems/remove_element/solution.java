class Solution {
    public int removeElement(int[] nums, int val) {
             int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
                nums[i]=-99;
            }
        }
        int k=0;
        int[] arr = new int[nums.length-count];
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=-99){
                arr[k++]=nums[j];
            }
        }
        for(k=0;k<arr.length;k++){
            nums[k]=arr[k];
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-count;
   
    }
}