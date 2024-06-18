package 初级算法题.数组和字符串算法题;

//要求显示12  和01234         后面的数不参考
public class 删除有序数组中的重复项 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }

    }

    public static int removeDuplicates(int[] nums) {

        if(nums.length ==0){
            return 0;
        }

        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if(nums[left] != nums[right]){
                //如果不相等的话就把left+1，把right赋值给left
                nums[++left] = nums[right];

            }
            //如果相等的话就不动
        }
        return left+1;
    }




}
