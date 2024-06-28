package 初级算法题.数组和字符串算法题;

public class 有效的数独 {


    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        isValidSudoku(board);
    }

    /*
    数字1-9在每一行只能出现一次。
    数字1-9在每一列只能出现一次。
    数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。（请参考示例图）
    注意：
    一个有效的数独（部分已被填充）不一定是可解的。
    只需要根据以上规则，验证已经填入的数字是否有效即可。
    空白格用'.'表示。
     */
    public static boolean isValidSudoku(char[][] board) {
        boolean[][] line = new boolean[9][9]; //一行
        boolean[][] column = new boolean[9][9];//一列
        boolean [][] cell = new boolean[9][9];//3*3 小格子
        int length = board.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                //没有数字就跳过
                if (board[i][j] == '.') {
//    System.out.println("略过: "+board[i][j]+" 行:"+(i+1)+" 列:"+(j+1));
                    continue;
                }
                int num = board[i][j] - '0' - 1; //得到对应的int值的下标
                 //第几个小宫格
                int k = i / 3 * 3 + j / 3;
                //判断当前值是否已经存在了
              if(line[i][num] || column[j][num] || cell[k][num]){
                       return false;
              }
                //把检查过的值赋为true
                line[i][num] = column[j][num] = cell[k][num] = true ;



            }
        }
        return true;
    }
}
