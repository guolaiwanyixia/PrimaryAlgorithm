package 初级算法题.字符串;

public class 反转字符串 {
    public static void main(String[] args) {
     char[] s = {'h','e','l','l','o'};
         //输出：["o","l","l","e","h"]
        reverseString(s);

    }
    //双指针交换
    public static void reverseString(char[] s) {
        int lift = 0;
        int right = s.length-1;
        char temp;

        while (lift <= right){
               temp = s[lift];
            s[lift++] = s[right];
            s[right--] = temp;

        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }

    }


}
