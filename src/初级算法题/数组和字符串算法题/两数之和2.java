package 初级算法题.数组和字符串算法题;

import java.util.HashMap;

//用map来查询
//优化之前的速度
public class 两数之和2 {
    public static void main(String[] args) {
        int[]nums ={2,7,11,15};
        int target = 9;
       // HashMap  key-value  键值对
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(nums[0],0);

        for (int i = 1; i < nums.length; i++) {
             //检查HashMap里面是否添加过对应的商，
            if(m.containsKey(target-nums[i])){
                System.out.println(m.get(target-nums[i])+" "+i);
            }
            m.put(nums[i],i);

        }
    }
}
