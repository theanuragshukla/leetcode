import java.util.Arrays;

class Solution {
    public int splitNum(int num) {
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
        
        Arrays.sort(digits);
        
        int num1 = 0, num2 = 0;
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + digits[i];
            } else {
                num2 = num2 * 10 + digits[i];
            }
        }
        
        return num1 + num2;
    }
}
