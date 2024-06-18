package 初级算法题.数组和字符串算法题;
//给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
//在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。
// 你也可以先购买，然后在 同一天 出售。

//返回 你能获得的 最大 利润 。

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class 买卖股票的最佳时机 {


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        maxProfit(prices);
    }

    public static void maxProfit(int[] prices) {
        //当天交易有2种情况
        //未交易和交易
        //未交易
        int length = prices.length;

        int total = 0;
        for (int i = 0; i < length-1; i++) {
           total += Math.max(0,prices[i+1]-prices[i]);
        }


    }
}