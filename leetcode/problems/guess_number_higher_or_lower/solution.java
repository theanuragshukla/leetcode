/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    int find(int min, int max){
        int mid= (min+(max-min)/2);
        System.out.println(mid);
        int res = guess(mid);
        if(res==0){
            return mid;
        }else if(res==1){
            return find(mid+1, max);
        }else {
            return find(min,mid);
        }
    }
    public int guessNumber(int n) {
        return find(0, n);
    }
}