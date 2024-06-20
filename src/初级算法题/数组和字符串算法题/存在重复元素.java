package 初级算法题.数组和字符串算法题;



import java.util.Arrays;
import java.util.HashSet;


public class 存在重复元素 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }

    public static boolean containsDuplicate(int[] nums) {
        //hashSet解决
        HashSet<Integer> set = new HashSet<>();
        for (int j :nums) {
               //执行添加，如果添加失败就等于有相同元素
            //重复就返回false再取反
            if(!set.add(j)){
                return true;
            }

        }


        return false;

    }
}
