package 初级算法题.数组和字符串算法题;

import java.util.Arrays;
import java.util.HashMap;

public class 两个数组的交集Ⅱ {

   //添加到hashMap 键值对
   public static void main(String[] args) {
       int [] nums1 = {2,6,9,6,5,3,5,9,8,7};
       int [] nums2 = {5,5};
       intersect(nums1,nums2);
   }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> HashMap = new HashMap<>();

        for (int i = 0; i < Math.max(nums2.length,nums1.length); i++) {
            if(nums1.length>nums2.length){
                HashMap.put(nums1[i], i);
            }else{
                HashMap.put(nums2[i], i);
            }

            //System.out.println(i);
            // System.out.println(HashMap.containsKey(0));
        }
        int temp []=new int[2];
       // int min = Math.min(nums2.length, nums1.length);
        //System.out.println(min);
        for (int i = 0; i <Math.min(nums2.length,nums1.length);i++) {
            if(nums1.length<nums2.length){
                if(HashMap.containsKey(nums1[i])){
                    temp[i] = nums1[i];
                    System.out.print(temp[i]);
                }

            }else{
                if(HashMap.containsKey(nums2[i])){
                    temp[i] = nums2[i];
                    System.out.print(temp[i]);
                }

            }

        }



return temp;
    }
}
