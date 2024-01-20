package chapter04;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        for ( int i = 0; i <= 10; i++){
            if ( i == 3) {
                break;
            }
            System.out.println("ok" + i);
        }
    }
}

class BreakDetail {
    public static void main(String[] args) {
        lable1:
        for(int j = 0;j < 4;j++){
            lable2:
                for(int i =0;i < 10; i++){
                    if(i == 2){
                        break lable1;
                    }
                    System.out.println("i=" + i);
                }
            System.out.println("j=" + j);
        }
    }
}

//1-100以内的数求和，
// 求出当和第一次大于20的当前数[for +break]

class BreakExercise {
    public static void main(String[] args) {
        int sum = 0;
        int n =0;
        for(int i =1;i <=100;i++){
            sum += i;
            if(sum > 20){
                System.out.println("和大于20时,当前数是：" + i);
                n = i;
                break;
            }
        }
        System.out.println("和大于20时,当前数是：" + n);
    }
}

//实现登录验证，有3次机会，
// 如果用户名为”丁真”，
// 密码“666“提示登录成功否则提示还有几次机会，请使用for+break完成

class BreakExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String username = "";
        String password = "";
        int chance = 3;
        for (int i =1;i <= 3;i++){
            System.out.println("请输入用户名");
            username = myScanner.next();
            System.out.println("请输入密码");
            password = myScanner.next();
            if("丁真".equals(username) && "666".equals(password)){
                System.out.println("登录成功");
                break;
            } else {
                    chance --;
                    System.out.println("还有" + chance + "次机会");
                }
            }
        }

    }

