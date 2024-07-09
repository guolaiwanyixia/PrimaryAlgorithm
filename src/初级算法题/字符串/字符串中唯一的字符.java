package 初级算法题.字符串;

import java.util.HashMap;

public class 字符串中唯一的字符 {
    public static void main(String[] args) {
        String s = "leetcode";
        firstUniqChar(s);

    }

    //官方api方法
    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }


        }

        return -1;

    }
}