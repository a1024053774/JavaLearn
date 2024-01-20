package chapter04;




//某人有100，000元，每经过一次路口，需要交费，
// 规则如下：
// 1）当现金>50000时，每次交5%
// 2）当现金<=50000时，每次交1000
// 编程计算该人可以经过多少次路口，
// 要求：使用while break方式完成

import java.util.Scanner;

public class Chapter04_HomeWork {
    public static void main(String[] args) {
        double now_money = 100000;
        int count = 0;
        while(now_money >= 1000){
            count++;
            if(now_money > 50000){
                now_money = now_money * 0.95;
            }else {
                now_money = now_money - 1000;
            }
        }
        System.out.println("一共经过了"+ count + "次路口");
    }
}



class Chapter04_HomeWork2{
    //实现判断一个整数，属于哪个范围：大于0；小于0；等于0
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入整数");
        int num = myScanner.nextInt();
        if (num > 0){
            System.out.println("此数大于0");
        } else if (num == 0){
            System.out.println("此数等于0");
        } else {
            System.out.println("此数小于0");
        }

    }
}


class Chapter04_HomeWork3{
    //判断一个年份是否为闰年
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年份(整数)");
        int year = myScanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}

class Chapter04_HomeWork4{
    //4.判断一个整数是否是水仙花数，
    // 所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
    // 例如：153=1*1*1+3*3*3+5*5*5
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个三位的整数");
        String integer_num = myScanner.next();
        if (integer_num.length() == 3){
            int hundred = integer_num.charAt(0) - '0';//将字符串转为整形
            int ten = integer_num.charAt(1) - '0';//将字符串转为整形
            int one = integer_num.charAt(2) - '0';//将字符串转为整形

            int sum = hundred * hundred * hundred +
                    ten * ten * ten + one * one * one;

            if (sum == Integer.parseInt(integer_num)) {
                System.out.println(integer_num + " 是一个水仙花数");
            } else {
                System.out.println(integer_num + " 不是一个水仙花数");
            }
        } else {
            System.out.println("输入不是一个三位数，请重新输入");
        }

    }
}