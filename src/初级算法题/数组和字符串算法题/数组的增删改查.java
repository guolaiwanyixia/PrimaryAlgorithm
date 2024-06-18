package 初级算法题.数组和字符串算法题;


//在下标为2的数组插入一个新元素
public class 数组的增删改查 {
    public static void main(String[] args) {

        //新建立一个字节数组
        int[] Num = {1, 3, 4, 5};
        //查找元素
        int LookupNum = 3;
        //查找索引检测
        int TestNum = -1;
        //查找元素的索引位置
        ///LookupNum(LookupNum, TestNum, Num);

        //通过索引方式查找
        int LookupIndex = 0;
        //查找索引检测
        int TestIndex = -1;

        //查找索引的元素
         ///LookupIndex(LookupIndex,TestIndex,Num);

        //遍历所有元素
        ///LookupAll(Num);

        //插入元素
        //添加一个2进到数组里


    }
    //查找数组里的所有元素
    public static void LookupAll(int[] Num ){
        for (int i = 0; i < Num.length ; i++) {
            System.out.print("遍历数组 数字为: " + Num[i] + "\t");
        }
    }


    //通过元素查找索引
    public static void LookupNum(int LookupNum, int TestNum, int[] Num) {
        for (int i = 0; i < Num.length; i++) {

            //查找数组的某个元素是否存在
            if (LookupNum == Num[i]) { //如果索引检测没有变化，就没有
                TestNum = i;
            }
        }
        //没有变化就等于-1 不等于-1就把下标对应的元素赋值
        if (TestNum != -1) {
            System.out.println("\n你搜索的数字为 :" + LookupNum + "\n下标为: " + TestNum);
        } else {
            System.out.println("\n你搜索的数字 :" + LookupNum + " 不存在");
        }

    }

    //通过索引查找元素
    public static void LookupIndex(int LookupIndex, int TestIndex, int[] Num) {
        for (int i = 0; i < Num.length; i++) {
            //查找数组的下标元素是否存在
            if (i == LookupIndex) {
                TestIndex = i;
            }
        }
        if (TestIndex != -1) {
            System.out.println("\n你搜索的下标为 :" + TestIndex + "\n元素为: " + Num[TestIndex]);
        } else {
            System.out.println("\n你搜索的下标 :" + LookupIndex + "不存在");
        }
    }





}

