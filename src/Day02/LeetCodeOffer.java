package Day02;
import java.util.*;
/**
 * @author ChillRain 2023 01 12
 */
public class LeetCodeOffer {
    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右非递减的顺序排序，每一列都按照从上到下非递减的顺序排序。
     * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    class Solution {
        public boolean findNumberIn2DArray01(int[][] matrix, int target) {//内存省一点
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
        public boolean findNumberIn2DArray02(int[][] matrix, int target) {//速度快
            if(matrix == null || matrix.length == 0){//如果为空直接false
                return false;
            }
            int row = matrix.length;
            int col = matrix[0].length;
            int x = 0;//从右上角开始走 如果所在位置大于target 向左走 小于target 向下走
            int y = col - 1;
            while(x < row && y >= 0){
                if(matrix[x][y] > target){
                    y--;
                    continue;
                }
                if(matrix[x][y] < target){
                    x++;
                    continue;
                }
                if(matrix[x][y] == target){
                    return true;
                }
                return false;
            }
            return false;
        }
    }
}
