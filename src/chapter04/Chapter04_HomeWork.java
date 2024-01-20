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