class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
     int find(int n){
        if(n<0){
            return 0;
        }
        if(n<arr.size()){
            return arr.get(n);
        }
        int sum = find(n-1)+find(n-2);
        arr.add(sum);
        return sum;
    }
    public int fib(int n) {
        arr.add(0);
    arr.add(1);
   
        return find(n);
    }
}