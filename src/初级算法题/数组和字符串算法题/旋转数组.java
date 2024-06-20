package 初级算法题.数组和字符串算法题;

public class 旋转数组 {
    //反转方法
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        //前三个数
        int key = 3;

        //全部反转
        rotate(nums,key);

    }

    public static void rotate(int[] nums,int k) {
        //按照固定的顺序依次向后移动3位


        int hold = nums[0];
        int index = 0;
        int length = nums.length;
        boolean[] visited = new boolean[length];
        for (int i = 0; i < length; i++) {
            index = (index + k) % length;
            if (visited[index]) {
                //如果访问过，再次访问的话，会出现原地打转的现象，
                //不能再访问当前元素了，我们直接从他的下一个元素开始
                index = (index + 1) % length;
                hold = nums[index];
                i--;
            } else {
                //把当前值保存在下一个位置，保存之前要把下一个位置的
                //值给记录下来
                visited[index] = true;
                int temp = nums[index];
                nums[index] = hold;
                hold = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        }
}




