package 初级算法题.数组和字符串算法题;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings({"all"})
public class 两个数组的交集Ⅱ {


    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        intersect(nums1, nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        //先排序，从小到大排
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        //再进行双指针移动
        int i = 0;
        int j = 0;
        List<Integer> List = new ArrayList();
        while (i< nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                 i++;
            }else if(nums1[i] > nums2[j]){
                 j++;
           }else{
                List.add(nums1[i]);
                i++;
                j++;
            }
            }
        //遍历Arraylist
        int[] s = new int[List.size()];
        int x = 0;
        for (Object o :List) {
            s[x] = (Integer) o;
             x++;

        }


        //System.out.println(Arrays.toString(nums1));

        return s;
    }
}
