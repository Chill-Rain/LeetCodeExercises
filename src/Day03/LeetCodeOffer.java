package Day03;

/**
 * @author ChillRain 2023 01 13
 */
public class LeetCodeOffer {
    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     */
    class Solution {
        public String replaceSpace(String s) {
            if(s == null){
                return null;
            }
            StringBuilder replacedS = new StringBuilder();//创建StringBuilder 用于拼接 不用buffer因为Builder速度快
            for (int i = 0; i < s.length(); i++){
                if(String.valueOf(s.charAt(i)).equals(" ")){// “ ”是字符串 charAt（）获取的是字符 转为字符串后对比
                    replacedS.append("%20");
                    continue;
                }
                replacedS.append(s.charAt(i));
            }
            return replacedS.toString();
        }
    }
}
