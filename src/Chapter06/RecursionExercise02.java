package Chapter06;

import java.util.Scanner;

public class RecursionExercise02 {
    public static void main(String[] args) {

        To to = new To();

        System.out.println("请输入想要的天数");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int res = to.peach(input);
        if (res != -1){
            System.out.println("第"+ input + "天的桃子数" + res);
        }

    }
}

class To{
    //猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，
    // 并再多吃了一个！
    // 以后每天猴子都吃其中的一半，然后再多吃一个。
    // 当到第10天时，想再吃时（即还没吃），发现只有1个桃子了。
    // 问题：最初共多少个桃子？

    /*
    思路  逆推
    1. day=10,有一个桃子
    2. day=9,有 (day10 + 1) * 2 = 4
    3. day=8,有(day9 + 1) * 2 = 10
     */

   public int peach(int day){
       if (day == 10){
           return 1;
       } else if (day >= 1 && day <= 9) {
           return (peach(day + 1) + 1) * 2;
       }else {
           System.out.println("输入的天数不对,应该在0-10之间");
           return -1;
       }
   }


}
