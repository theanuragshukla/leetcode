class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] arr = new int[len];
        arr[len-1] = prices[len-1];
        int ans = 0;
        for(int i = len-2;i>=0;i-- ){
            arr[i]=prices[i]>arr[i+1] ? prices[i] : arr[i+1];
        }
        for(int i = 0; i< len;i++){
            ans= Math.max(arr[i]-prices[i], ans );
        }
        return ans;
    }
}