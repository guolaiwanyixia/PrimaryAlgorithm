package 初级算法题.数组和字符串算法题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 两个数组的交集Ⅱ {

    //添加到hashMap 键值对
    public static void main(String[] args) {
        int [] nums1 = {2,6,9,6,5,3,5,9,5,7};
        int [] nums2 = {5,5,5,5,5};
        intersect(nums1,nums2);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> Map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        //因为不知道添加的数组有几个相同的，所以用
        //先便利第一个数组
        for (int i = 0; i < nums1.length ; i++) {
            //key是元素  value是重复的次数
            //没添加过就返回0+1，添加过就会返回1 ，再+上1 就等于有2个相同的元素
            Map.put(nums1[i],Map.getOrDefault(nums1[i],0)+1);
        }
        for (int i :nums2) {
            if(Map.getOrDefault(i,0) > 0){
                list.add(i);
                Map.put(i,Map.get(i)-1);
            }
        }
        //把集合list转化为数组
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
            System.out.print(res[i]);
        }
        return res;
    }
}

