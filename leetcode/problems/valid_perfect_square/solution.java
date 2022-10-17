class Solution {
    public boolean isPerfectSquare(int n) {
       double log = Math.log(n);
        if(log==0){
            return true;
        }
        log/=2;
        int i = 2;
        while(true){
            double sq=Math.log(i++);
            if(sq==log){
                return true;
            }
            if(sq>log){
                return false;
            }
        }
    }
}