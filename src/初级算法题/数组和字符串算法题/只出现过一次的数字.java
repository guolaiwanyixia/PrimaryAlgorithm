package 初级算法题.数组和字符串算法题;

public class 只出现过一次的数字 {
    //按位异或有结合律
    //4,1,2,1,2可以看成1,1,2,2,4
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        singleNumber(nums);
    }

    public static int singleNumber(int nums[]) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];

            System.out.print(result+" ");
        }

        System.out.println(result);
        return result;
    }
}
