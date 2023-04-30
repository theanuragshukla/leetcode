class Solution {
    public int isWinner(int[] arr1, int[] arr2) {
        int m1 = 0, m2=0; int n1=0, n2 = 0;
        int val1 = 0, val2 = 0;
        for(int x:arr1){
            if(m1==10 || m2==10){
                val1+=(2*x);
            }else{
                val1+=x;
            }
            m2=m1;
            m1 = x;
        }
        for(int x:arr2){
            if(n1==10 || n2==10){
                val2+=(2*x);
            }else{
                val2+=x;
            }
            n2=n1;
            n1=x;
        }
     return (val1>val2 ? 1 : (val1<val2 ? 2 : 0));
    }
    
   
}