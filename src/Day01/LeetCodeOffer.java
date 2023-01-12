package Day01;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author ChillRain 2023 01 11
 */
public class LeetCodeOffer {

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
