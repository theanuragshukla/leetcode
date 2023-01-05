class Solution {
    public int findMinArrowShots(int[][] points) {
        int mod=(int)Math.pow(10,9)+7;
        Arrays.sort(points,(a,b)->(a[0]%mod-b[0]%mod));
        int arrows=1;
        for(int i=1;i<points.length;i++)
        {
            if(points[i-1][1]>=points[i][0]){
                points[i][1]=Math.min(points[i][1],points[i-1][1]);
            }
            else{
                arrows++;
            }
        }
        return arrows;
    }
}