package Day04;

/**
 * @author ChillRain 2023 01 21
 */
public class LeetCodeHOT {
    /**
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     *
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     *
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     *
     */
    class Solution {
        /**
         * 动态规划
         * @param prices
         * @return
         */
        public int maxProfit(int[] prices) {
            if(prices.length <= 1){
                return 0;
            }
            int min = prices[0]; //初始化设定最小值为第一天
            int max = 0;//利润 初始化为0 （最差也不能赔了）
            for(int i = 1; i < prices.length; i++){ //遍历所有天的价格
                max = Math.max(prices[i] - min, max);//尝试出售股票 计算利润并取最大值
                min = Math.min(min, prices[i]);//
            }
            return max;
        }
    }
}
