class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int i=0,j=0,k=0;
        int n1=arr1.length,n2=arr2.length;
        int[] merge= new int[n1+n2];
          while (i < n1 && j < n2) {
         if (arr1[i] < arr2[j])
            merge[k++] = arr1[i++];
         else
            merge[k++] = arr2[j++];
      }
      while (i < n1)
      merge[k++] = arr1[i++];
      while (j < n2)
      merge[k++] = arr2[j++];
        boolean even = (n1+n2)%2==0;
    int x = even ? (n1+n2)/2:((n1+n2)/2)+1 ;
        x--;
        if(!even){
            return((double)merge[x]);
        }
        return ((double)(merge[x]+merge[x+1]))/2.0;
    }
}