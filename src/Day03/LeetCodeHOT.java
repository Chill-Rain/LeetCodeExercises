package Day03;

/**
 * @author ChillRain 2023 01 13
 */
public class LeetCodeHOT {
    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     */
    class Solution {
        /**
         * 动态规划 类似于斐波那契数列
         * @param n
         * @return
         */
        public int climbStairs(int n) {
            int arr[] = new int[3];
            int i = 0;
            for(;i < n; i++){
                if(i==0) arr[0] = 1;
                if(i==1) arr[1] = 2;
                if(i>1) arr[(3+i)%3] = arr[(3+(i-1))%3] + arr[(3+(i-2))%3];
            }
            return arr[(n-1)%3];
        }
    }
}
