class Solution {
    public int trap(int[] h) {
        int ttl = 0;
        int [] left = new int [h.length];
        left[0]=h[0];
        int [] right = new int [h.length];
        right[h.length-1] = h[h.length-1];
        for(int i=1;i<h.length;i++){
            left[i]=(left[i-1]>h[i] ? left[i-1] : h[i]);
            right[h.length - i - 1]=(right[h.length - i]>h[h.length - i - 1] ? right[h.length - i] : h[h.length - i - 1]);
        }
        for(int i = 0; i < h.length;i++){
            int wtr = (left[i] < right[i]) ? left[i] - h[i]: right[i] - h[i];
            if(wtr > 0)ttl+=wtr;
        }
        return ttl;
    }
}