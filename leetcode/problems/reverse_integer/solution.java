import java.math.BigInteger;
class Solution {
    public int reverse(int x) {
        BigInteger ans = new BigInteger("0");
        BigInteger h1 = new BigInteger(Integer.toString(Integer.MAX_VALUE));
        BigInteger h2 = new BigInteger(Integer.toString(-1*Integer.MAX_VALUE-1));
        System.out.println(h1);
        while(x!=0){
            int dgt = x%10;
                   ans=(ans.multiply(BigInteger.valueOf(10))).add(BigInteger.valueOf(dgt));
            System.out.println(ans);
            x/=10;
                if( ans.compareTo(h1)==1 || ans.compareTo(h2)==-1 ) {
                return 0;
              //  break;
            }
 
        }
        return ans.intValue();
    }
}