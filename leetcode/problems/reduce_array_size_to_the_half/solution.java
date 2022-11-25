class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
        }
        int[][] a = new int[m.size()][2];
        int p = 0;
        for(Integer k : m.keySet()){
            a[p][0] = k;
            a[p++][1] = m.get(k);
        }
        Arrays.sort(a, (a1,b1) -> b1[1]-a1[1]);
        p = 0;
        int ret = 0;
        for(int i = 0; i<a.length; i++){
            p+=a[i][1];
            ret++;
            if(p>=arr.length/2){
                return ret;
            }
        }
        return ret;
    }
}