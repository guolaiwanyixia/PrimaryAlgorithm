package 初级算法题.数组和字符串算法题;

public class 旋转数组 {
    //反转方法
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        //前三个数
        int key = 3;
        int start = 0;
        int end = nums.length-1;
        key %= nums.length;
        //全部反转
        rotate(nums,start,end);
        //反转前3个
        rotate(nums,start,key-1);
        //反转后4个
        rotate(nums,key,end);
    }

    public static void rotate(int[] nums,int start,int end) {
        int temp = 0;
        //双指针 start，end 反转数组
        while (start < end){
            temp = nums[start];
            nums[start++] = nums[end];
            nums[end--]  = temp;

        }



        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();

}
}
