package 初级算法题.数组和字符串算法题;



import java.util.Arrays;


public class 存在重复元素 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }

    public static boolean containsDuplicate(int[] nums) {
        //先排序
        Arrays.sort(nums);
        //排完之后如果有重复的就会并在一起
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                return true;
            }

        }
        return false;

    }
}
