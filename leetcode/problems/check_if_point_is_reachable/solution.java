class Solution {
    public boolean isReachable(int x, int y) {
        while(x%2==0)x/=2;
        while(y%2==0)y/=2;
        System.out.printf("%d %d", x, y);
       while(x!=0 || y!=0)
        if(y>x){
            while(y>x)y-=x;
        }else if(x> y){
            while(x>y)x-=y;
        }else break;
        return (Math.abs(x-y)==1 || x==1 || y==1);
    }
}