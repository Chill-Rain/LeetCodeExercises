package Day04;

/**
 * @author ChillRain 2023 01 21
 */
public class LeetCodeOffer {
    /**
     * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
     */
    class Solution {
        public int fib(int n) {
            if(n == 1 || n == 0){
                return n;
            }
            int fib1 = 0; //数列前一项
            int fib2 = 1; //数列后一项
            for(int i = 2; i <= n; i++){
                fib2 += fib1; // 0 + 1 = 2;
                fib1 = fib2 - fib1; // 2 - 0 = 1;
                fib2 %= 1000000007;
            }
            return fib2;
        }
    }
}
