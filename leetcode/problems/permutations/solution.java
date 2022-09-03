class Solution {
      static HashSet<ArrayList<Integer>> elemArr = new HashSet<ArrayList<Integer>>();

        public List<List<Integer>> permute(int[] arr) {
            ArrayList<Integer> list = new ArrayList<Integer>(arr.length);
for (int i = 0; i < arr.length; i++)
  list.add(Integer.valueOf(arr[i]));
      permute(list,0);
        List<List<Integer>> ret = new ArrayList<List<Integer>>(elemArr);
            elemArr.clear();
        return ret;
    }
    
  
	static void permute(ArrayList<Integer> arr, int k){
        for(int i = k; i < arr.size(); i++){
            Collections.swap(arr, i, k);
            permute(arr, k+1);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            ArrayList<Integer> elem = new ArrayList<Integer>(arr);
            elemArr.add(elem);
        }
    }

}
