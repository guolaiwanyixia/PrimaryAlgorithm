package 初级算法题.数组和字符串算法题;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class 移动零 {
    public static void main(String[] args) {
       int [] nums = {0,1,0,3,12};
       //   双指针交换法

        moveZeroes(nums);

    }

    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right ;
        int temp = 0;

        for ( right = 0; right <length ; right++) {
              if(nums[right] != 0){
                  temp = nums[left];
                  nums[left]= nums[right];
                  nums[right]= temp;
                  left++;
              }
        }

//        for (int temp = left ; temp < length ; temp++) {
//            nums[temp] = 0;
//        }
        System.out.println(Arrays.toString(nums));


    }
}
