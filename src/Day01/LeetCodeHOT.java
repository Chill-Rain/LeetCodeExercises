package Day01;


import java.util.ArrayList;

/**
 * @author ChillRain 2023 01 11
 */
public class LeetCodeHOT {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            ArrayList myNums = new ArrayList(); //把数组放进队列 方便获取下标
            for (int i = 0; i < nums.length; i ++){
                myNums.add(nums[i]);
            }
            int[] needNumIndexs = new int[2]; //返回的数组
            for (int i = 0; i < nums.length; i ++){ //查找答案 没找到则重新进行循环
                int needNum = target - nums[i];
                int needNumIndex = myNums.lastIndexOf(needNum);
                if(needNumIndex <= i){
                    continue;
                }
                needNumIndexs[0] = i;
                needNumIndexs[1] = needNumIndex;
                break;
            }
            return needNumIndexs;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int[] ints = new Solution().twoSum(nums, 6);
        System.out.println(ints);
    }
}
