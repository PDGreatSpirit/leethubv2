/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n)
        {
            long s = 1;
            //초기 값 
            while (s <= n)
            {
                int x = (int)((n + s) / 2);
                //중앙 값 
                int g = guess(x);
                //추측
                if (g == 0)  return x;
                //정답
                if (g < 0)   n = x - 1;
                //숫자가 더 작다 
                if (g > 0)   s = x + 1;
                //숫자가 더 크다 
            }
            return -1;
        }
}