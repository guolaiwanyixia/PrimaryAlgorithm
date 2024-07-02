package 初级算法题.数组和字符串算法题;

import java.util.ArrayList;

public class 旋转图像 {
//matrix = [[1,2,3],[4,5,6],[7,8,9]]

    public static void main(String[] args) {
        int[][]  matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        rotate(matrix);

    }
    public static void rotate(int[][] matrix) {
        //先上下交换

        int length = matrix.length;

        for (int i = 0; i < length; i++) {
            int []tmp = matrix[i];
            matrix[i] = matrix[length-1-i];
            matrix[length-1-i] = tmp ;
        }
        //然后对角线交换

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]  = temp;

            }
        }


    }
}
