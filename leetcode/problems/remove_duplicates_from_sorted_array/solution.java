import java.lang.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                nums[i]=-6969;
            }
        }
        int k=0;
        int[] arr = new int[nums.length-count];
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=-6969){
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