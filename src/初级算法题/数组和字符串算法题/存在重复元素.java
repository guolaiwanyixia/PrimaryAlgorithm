package 初级算法题.数组和字符串算法题;

import java.util.HashMap;

public class 存在重复元素 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> HashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

           if(HashMap.containsKey(nums[i])){
               return true;
           }
            HashMap.put(nums[i], i);
        }
        return false;
    }
}
