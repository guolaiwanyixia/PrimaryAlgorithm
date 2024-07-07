package 初级算法题.字符串;

public class 整数反转 {
    public static void main(String[] args) {


    }

    public static int reverse(int x) {
        int res = 0;

        while (x != 0) {
            int i = x % 10;//取个位数     1. 假设x是1234       1234/10 = 123.4  取尾数 4
            int newRes = res * 10 + i;       //  0*10 + 4 = 4
                                      // 2.现在x是123     123 / 10 = 12.3
                                         //     (上一次的res是4)   4*10 + (取模尾数是)3 = 43    ...以此类推
                                                             //3.   43*10+2 = 432
            if ((newRes - i) / 10 != res) {  //判断x是否溢出了32位，题目要求
                return 0;
            }
            res = newRes;       //把数赋给res
            x = x / 10;         //把1234 / 10  等于123.4   但是他是int类型取整 等于123   好进行下一次取模
                               //直到1 / 10 = 0.1   int类型就是0  结束循环
        }
        return res;
    }
}
