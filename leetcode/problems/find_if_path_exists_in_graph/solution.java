class Solution {
    private int hash(int a, int b){
        return (a+b)*(a+b+1)/2+a;
    }
    int root(int[] arr , int i){
        while(arr[i]!=i){ 
        i=arr[i];
    }
        return i;
    }
boolean find(int[]arr, int a,int b){
    if( root(arr, a)==root(arr, b) )  
    return true;
    else
    return false;
}
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int m = edges.length;
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = i;
        }
        for(int i = 0; i< m; i++){
            int val1 = arr[edges[i][0]];
            int val2 = arr[edges[i][1]];
               int root1 = root(arr, val1);       
    int root2 = root(arr, val2);  
    arr[root1] = root2 ;   
        }
        return find(arr, source, destination);
    }
}