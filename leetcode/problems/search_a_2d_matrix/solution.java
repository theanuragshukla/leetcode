class Solution {
    boolean search(int[] arr, int t, int l,int u){
        if(l==u)
            return arr[l]==t;
        if(arr[l]==t || arr[u]==t)return true;
        int m =l+ (u-l)/2;
        if(arr[m]==t)
            return true;
        else{
            if(arr[m]<t)
                return search(arr,t,m+1,u);
            else
                return search(arr, t, 0, m-1);
        }
       }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
           if(matrix[i][0]<=target && matrix[i][m-1]>=target){
               return search(matrix[i], target, 0, m-1);
           }
        }
        return false;
    }
}