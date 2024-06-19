package 初级算法题.数组和字符串算法题;

public class 旋转数组 {
    //
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        //前三个数
        int key = 3;
        rotate(nums, key);
    }

    public static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        //把数组复制一份
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
            System.out.print(temp[i] + " ");

        }
        System.out.println();
        //把新数组的值赋给旧数组
        for (int i = 0; i < nums.length; i++) {
            //利用取模的性质来巧妙的复制
            nums[(i + k) % nums.length] = temp[i];

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }



    }
}
