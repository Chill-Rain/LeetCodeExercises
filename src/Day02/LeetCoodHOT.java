package Day02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ChillRain 2023 01 12
 */
public class LeetCoodHOT {
    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     */
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            //最优解应使用滑动窗口 有两个指针start end 每次移动指针前 先将元素放入Set中 如果成功了 就证明没有重复 end右移 长度 +1
            //如果没有成功 证明其有重复元素 移除 start位置的元素 start右移 长度 - 1 每一次加入都与 最大长度比较 如果大于则记录 不大于则舍弃
            Set set = new HashSet();
            int start = 0;
            int length = 0;
            int end = 0;
            int max = 0;
            while(end < s.length()){
               if(set.add(s.charAt(end))){
                   end ++;
                   length ++;
               }else {
                   set.remove(s.charAt(start));
                   start++;
                   length--;
               }
               max = max >= length ? max : length;
            }
            return max;
        }

    }
    @Test
    public void test(){
        System.out.println(new Solution().lengthOfLongestSubstring("wwekew"));
    }
}
