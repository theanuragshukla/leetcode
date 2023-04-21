class Solution {
    public double angleClock(int hour, int minutes) {
        double min=minutes*6;
        double rem=minutes/60.00;
        double hr = hour*30+rem*6*5;
        double ans=Math.abs(min-hr);
        double res=Math.min(ans,360-ans);
        return res;
    }
}