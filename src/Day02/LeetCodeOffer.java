package Day02;
import java.util.*;
/**
 * @author ChillRain 2023 01 12
 */
public class LeetCodeOffer {
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            ArrayList numberList = new ArrayList();//创建列表把二维数组放进来
            for(int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    numberList.add(matrix[i][j]);
                }
            }
            int result = numberList.indexOf(target); //能查找到下标那就是有 没有下标那就是没有
            if(result != -1) return true;
            return false;
        }
    }
}
