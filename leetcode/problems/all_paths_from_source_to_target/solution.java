class Solution {
    private List<List<Integer>> ret = new ArrayList<>();
    private void helper(int[][] arr, int pos , List<Integer> list){
        int len = arr.length;
        if(pos==len){
            return;
        }
        list.add(pos);

        if(pos==len-1){
            this.ret.add(list);
            return;
        }

        for(int nodes : arr[pos]){
            List<Integer> list1 = new ArrayList<>(list);
            helper(arr, nodes, list1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        this.helper(graph, 0 , list);
        return ret;
    }
}