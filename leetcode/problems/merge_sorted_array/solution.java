class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i = 0, j=0,k=0;
        while(k<(m+n) && i<m && j< n){
            int n1 = nums1[i];
            int n2 = nums2[j];
            if(n1<=n2){
                ans[k]=n1;
                i++;
            }else{
                ans[k]=n2;
                j++;
            }
            k++;
        }
        while(i<m){
            ans[k++]=nums1[i++];
        }
        
        while(j<n){
            ans[k++]=nums2[j++];
        }
        k=0;
        i=0;
        while(k<(m+n)){
            nums1[k++]=ans[i++];
        }
    }
}