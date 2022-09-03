class Solution {
    public void rotate(int[][] m) {
        int len = m.length;
        int[][] buff = new int[len][len];
        for(int i = 0;i<len;i++){
            for(int j = 0;j<len;j++){
                buff[i][j]=m[len-1-j][i];
            }
        }
        for(int i = 0; i< len;i++){
            m[i]=buff[i];
        }
    }
}