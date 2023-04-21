class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] res=new int[2];
        int[] road = new int[edges.length+1];
        for(int i=1;i<road.length;i++){
            road[i]=i;
        }
        
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0],b=edges[i][1];
        
            while(road[a]!=a) a=road[a];
            while(road[b]!=b) b=road[b];
            if(a==b){
                res=edges[i];
            }else{
                road[a]=b;
            }
        }
        return res;
    }
}