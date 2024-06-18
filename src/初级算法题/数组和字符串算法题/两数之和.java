package 初级算法题.数组和字符串算法题;

public class 两数之和 {
    public static void main(String[] args) {
        int[]nums ={2,7,11,15};
        int target = 9;
        //System.out.println(nums.length);
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
//                System.out.println("i="+nums[i]+"\t"+"j="+nums[j]);
                if(nums[i]+nums[j]==target){
                    System.out.println("i="+i+"\t"+"j="+j);
                }
            }

        }


    }
}
