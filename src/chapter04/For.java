package chapter04;

import java.util.Scanner;

public class For {
    public static void main(String[] args){
        int i = 1;
        for ( ; i <= 10; ){
            System.out.println("你好" + i);
            i++;
        }
    }
}

class for02 {
    public static void main(String[] args){
        int count = 3;
        for (int i = 0, j = 0; i < count; i++, j+= 2){
            System.out.println("i=" + i + "j=" + j);
        }
    }
}
//打印1~100之间所有是9的倍数的整数，统计个数及总和
class for03 {
    public static void main(String[] args){
        int sum = 0;
        int count = 0;
        Scanner myScanner01 = new Scanner(System.in);
        System.out.println("请输入起始值(整数)");
        int x = myScanner01.nextInt();
        System.out.println("请输入结束值(整数)");
        int y = myScanner01.nextInt();
        System.out.println("请输入想要的倍数(整数)");
        int z = myScanner01.nextInt();
        for ( int i =x; i <= y ; i++){
            if ( i % z == 0) {
                System.out.println("i=" + i);
                count++;
                sum += i;
            }
        }
        System.out.println("总和是" + sum);
        System.out.println("个数是" + count);
    }
}

class for04 {
    public static void main(String[] args){
        int n =5;
        for (int i=0; i <= n; i++){
                System.out.println(i + "+" + (n-i) + "=" + n);
        }
    }
}