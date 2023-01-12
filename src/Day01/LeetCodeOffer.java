package Day01;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author ChillRain 2023 01 11
 */
public class LeetCodeOffer {
    /**
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     */
    class Solution {
        public int findRepeatNumber(int[] nums) {
            Integer number = null; //用于记录重复数字
            if(nums.length != 0){ //长度为0则不用判断
                Arrays.sort(nums); //将数组排序 使得重复数字相邻
                for (int i = 1; i <= nums.length; i ++){
                    if(nums[i - 1] == nums[i]){
                        number = nums[i]; //记录重复数字
                        break;
                    }
                }
            }
            return number;
        }
    }
}
