package Chapter06;

import java.util.Scanner;

public class RecursionExercise01 {
    public static void main(String[] args) {
        Tool t1 = new Tool();

        System.out.println("请输入想要的n(整数)");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int res = t1.Fibonacci(input);
        if (res != -1){
        System.out.println("当n等于" + input + "时,对应的斐波那契数=" + res);}

    }
}

class Tool{
    //求出斐波那契数列
    public int Fibonacci(int n){
        if( n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        } else {
            System.out.println("输入的n需要大于等于1");
            return -1;
        }

    }

}
