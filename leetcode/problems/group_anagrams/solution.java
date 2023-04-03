class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            List<String> val = m.getOrDefault(key, new ArrayList<String>());
            val.add(str);
            m.put(key,val);
        }
        List<List<String>> ret = new ArrayList<>();
        for(String k : m.keySet()){
            ret.add(m.get(k));
        }
        return ret;
    }
}