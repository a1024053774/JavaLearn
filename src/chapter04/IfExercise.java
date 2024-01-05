package chapter04;

import java.util.Scanner;

public class IfExercise {
        public static void main (String[] args ){
            double num1 = 30.5;
            double num2 = 2.5;
            if(num1 > 10.0 && num2 < 20.0) {
                double sum = num1 + num2;
                System.out.println("num1和num2的和是"+ sum );
            }
        }
}

class If01 {
    public static void main(String[] args) {
        //编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，
        // 则输出 你年龄大于18
        // 思路分析
        // 1接收输入的年龄，应该定义一个Scanner 对象
        // 2把年龄保存到一个变量 int age
        // 3使用 if 判断，输出对应信息
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        if (age > 18) {
            System.out.println("你的年龄大于18");
        }

    }
}

class If02 {
    public static void main (String[] args ){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = myScanner.nextInt();
        if (age > 18 ) {
            System.out.println("你成年了");
        } else {
            System.out.println("你还未成年");
        }
    }
}


class IfExercise02 {
    public static void main (String[] args ){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int i1 = myScanner.nextInt();
        System.out.println("请输入第二个整数");
        int i2 = myScanner.nextInt();
        int sum2 = i1 + i2;
        if ( sum2 % 3 == 0 && sum2 % 5 == 0) {
            System.out.println(i1 + "与"
                    + i2 + "的和同时能被3和5整除");
        } else {
            System.out.println(i1 + "与"
                    + i2 + "的和不能能被3和5整除");
        }
    }
}

class IfExercise03 {
    public static void main (String[] args ){
        Scanner myScanner02 = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = myScanner02.nextInt();
        if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
    {
     System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}

class IfExercise04 {
    public static void main (String[] args){
        Scanner myScanner03 = new Scanner(System.in);
        System.out.println("请输入芝麻信用分(1~100)：");
        int CreditScore = myScanner03.nextInt();
        if (CreditScore >=1 && CreditScore <= 100) {
            if (CreditScore == 100) {
                System.out.println("芝麻信用分极好");
            } else if (CreditScore > 80 && CreditScore <= 99) {
                System.out.println("芝麻信用分优秀");
            } else if (CreditScore > 60 && CreditScore <= 80) {
                System.out.println("芝麻信用分一般");
            } else {
                System.out.println("芝麻信用分不合格");
            }
        } else {
            System.out.println("输入有误,范围在1~100，:(");
        }
    }
}

//嵌套分支
class IfExercise05 {
    public static void main(String[] args) {
        Scanner myScanner04 = new Scanner(System.in);
        System.out.println("请输入性别");
        char gender = myScanner04.next().charAt(0);
        System.out.println("请输入成绩");
        double score = myScanner04.nextDouble();
        if (gender == '男') {
            System.out.println("进入了男子组");
            if (score > 8.0 ) {
                System.out.println("进入了决赛");
            } else {
                System.out.println("淘汰");
            }
        } else if (gender == '女') {
            System.out.println("进入了女子组");
            if (score > 8.0 ) {
                System.out.println("进入了决赛");
            } else {
                System.out.println("淘汰");
            }
        } else {
            System.out.println("请先输入正确的性别");
        }
    }
}

class IfExercise06 {
    public static void main(String[] args) {
        Scanner myScanner05 = new Scanner(System.in);
        System.out.println("请输入月份");
        int session = myScanner05.nextInt();
        System.out.println("请输入年龄");
        int age = myScanner05.nextInt();
        if (session >=1 && session <= 12) {
            if (session >= 4 && session <= 10) {

                if (age > 0 && age <= 100) {
                    if (age > 18 && age < 60) {
                        System.out.println("票价为60元");
                    } else if (age < 18) {
                        System.out.println("票价为30元");
                    } else {
                        System.out.println("票价为20元");
                    }
                } else {
                    System.out.println("年龄不合法");
                }
            } else {
                if (age > 0 && age <= 100) {
                    if (age > 18 && age < 60) {
                        System.out.println("票价为40元");
                    } else {
                        System.out.println("票价为20元");
                    }
                } else {
                    System.out.println("年龄不合法");
                }
            }
        } else {
            System.out.println("季节不合法");
        }
    }
}


