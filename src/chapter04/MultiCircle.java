package chapter04;

import java.util.Scanner;

public class MultiCircle {
    public static void main(String[] args) {
        for (int i =0;i < 2; i++) {
            for (int j = 0;j < 3;j++){
                System.out.println("i=" + i + "j=" + j);
            }
        }
    }
}

class NineMultiNine {
    public static void main(String[] args) {
        int sum;
        for (int i =1;i < 10; i++) {
            for (int j = 1;j <= i;j++){
                sum = i * j;
                System.out.print( i + "*" + j + "=" + sum);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}

//统计3个班成绩情况，每个班有5名同学，
// 求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
// 统计三个班及格人数，每个班有5名同学。
class MultiExe {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double avg_class;
        double sum_avg = 0;
        double avg_all;
        int passNum = 0;
        int classNum = 3;
        int stuNum = 5;
        for( int i = 1; i <= classNum; i++ ){
            double sum_class = 0;
            for ( int j =1; j <=stuNum; j++){
                System.out.println("请输入第"+ i +"个班第"
                        +j+"个学生的成绩");
                double score = myScanner.nextDouble();
                if( score >= 60) {
                    passNum++;
                }
                System.out.println("成绩为" + score);
                sum_class += score;
            }
            avg_class = sum_class / stuNum;
            System.out.println("班级"+ i +"总分为" + sum_class
            + "平均分是" + avg_class);
           sum_avg += avg_class;
        }
        avg_all = sum_avg / classNum;
        System.out.println("总平均分是" + sum_avg
                +"3个班的总平均分是" + avg_all
                + "及格人数是" + passNum);

    }
}



/*思路分析
*   1.先打印一个矩形
*   2. 打印半个金字塔
*     *
*     **
*     ***
*     ****
*     *****
*   3.3。打印整个金字塔
         *          第1层有1个*  2*1-1   有4=(总层数-1)个空格
        ***         第2层有3个*  2*2-1   有3=(总层数-2)个空格
       *****        第3层有5个*  2*3-1   有2=(总层数-3)个空格
      *******       第4层有7个*  2*4-1   有1=(总层数-4)个空格
     *********      第5层有9个*  2*5-1   有0=(总层数-5)个空格
    4.打印空心金字塔
  当前行第一个位置是*，最后一个位置也是*
         *          第1层有1个*
        * *         第2层有2个*
       *   *        第3层有2个*
      *     *       第4层有2个*
     *********      第5层有9个*
 */

class Pyramid {
    public static void main(String[] args) {
        Scanner myScanner02 = new Scanner(System.in);
        System.out.println("请输入想要的空心金字塔层数");
        int floor = myScanner02.nextInt();
        for (int i = 1; i <=floor;i++){
            //输出空格
            for (int k = 1; k <= floor-i;k++) {
                System.out.print(" ");
            }
            //输出星号
            for (int j = 1; j <= i * 2 - 1; j++) {
                //当前行的第一个位置是*，最后一个位置也是*
                //最后一层全部*
                if(j == 1 || j == i * 2 - 1 || i == floor) {
                    System.out.print("*");
                } else { //中间行
                    System.out.print(" ");
                }
            }
        System.out.print("\n");
        }
    }
}