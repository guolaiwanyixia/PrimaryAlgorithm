package 初级算法题.数组和字符串算法题;

public class 旋转数组 {
//
public static void main(String[] args) {
    revolve();
    //revolve2();
}

public static void revolve(){
   int [] nums ={1,2,3,4,5,6,7};
    int tempend = 0;
    for (int j = 0; j < 3; j++) {
        tempend = nums[nums.length-1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i ] = nums[i-1];
        }
        nums[0] = tempend;
    }

}

    public static void revolve2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int end = nums[nums.length - 1];
        int tempend = 0;
        for (int j = 0; j < 3; j++) {
            tempend = nums[nums.length - 1]; // 将最后一个元素保存到tempend
            for (int i = nums.length - 1; i > 0; i--) { // 从倒数第二个元素开始向前移动
                nums[i] = nums[i - 1];
            }
            nums[0] = tempend; // 将tempend赋值给第一个元素
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
