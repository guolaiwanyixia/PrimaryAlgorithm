package 初级算法题.字符串;

import java.util.HashMap;
import java.util.Map;

public class 字符串中唯一的字符 {

    //HashMap法
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap();
        char[] chars = s.toCharArray();
        //先统计每个字符的数量
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        //然后在遍历字符串s中的字符，如果出现次数是1就直接返回
        for (int i = 0; i < s.length(); i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

}