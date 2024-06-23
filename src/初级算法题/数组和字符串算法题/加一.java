package 初级算法题.数组和字符串算法题;

import java.util.ArrayList;
import java.util.Arrays;

public class 加一 {

    public static void main(String[] args) {
        //我的想法是，先便利数组，如果有9 就把对应的下标记录下来
       int [] digits = {1,0,0,9};
        int[] ints = plusOne(digits);
        for (Object o :ints) {
            System.out.print(o);
        }

    }

    public static int[] plusOne(int[] digits) {
      int length = digits.length;
      int count = 0;
        int[] newNums;

        //这里先进行一轮检查
        for (int i = 0; i < length; i++) {
            //最大情况 i都是9   也就是length = temp  就直接news数组赋值
            //最小情况
            if (digits[i] == 9) {
                count++;
            }
        }
        //最大情况
        if(count==length){
            //如果是最大情况就是位数 全是9
            //就直接把原数字第一位变成1，其余都为0
            newNums = new int[length+1];
              newNums[0] =1;
            for (int i = 1; i < newNums.length; i++) {
                    newNums[i] =0;
            }
            return newNums;
        }
      //其余情况
        //如果某个位置上有9就直接赋值成0
        //如果有位置上不是9就代表要+1  就直接可以退出了
        for (int i = length-1; i >= 0 ; i--) {
            if(digits[i]!=9){
                digits[i] = (digits[i]+1);
                break;
            }
            digits[i] = 0;

        }

        return digits;
        }

}
