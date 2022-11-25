class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int savings = tasks[0][1]-tasks[0][0];
        int ttl = tasks[0][1];
        for(int i = 1; i< tasks.length; i++){
            int ai = tasks[i][0];
            int mi = tasks[i][1];
            int diff = mi - savings;
            if(diff>0){
                savings+=diff;
                ttl+=diff;
            }
            diff = ai - savings;
            if(diff > 0){
                savings+=diff;
                ttl+=diff;
            }
            savings-=ai;
        }
        return ttl;
    }
}