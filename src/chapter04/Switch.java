package chapter04;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner myScanner01 = new Scanner(System.in);
        System.out.println("请输入a~g的字符：");
        char character = myScanner01.next().charAt(0);

        switch (character ) {
            case 'a' :
                System.out.println("星期一");
                break;
            case 'b' :
                System.out.println("星期二");
                break;
            case 'c' :
                System.out.println("星期三");
                break;
            case 'd' :
                System.out.println("星期四");
                break;
            case 'e' :
                System.out.println("星期五");
                break;
            case 'f' :
                System.out.println("星期六");
                break;
            case 'g' :
                System.out.println("星期日");
                break;
            default:
                System.out.println("无匹配");
        }
    }
}

//使用switch把小写类型的char型转为大写（键盘输入）。
// 只转换a，b，c，d，e.其它的输出other
class SwitchExercise01 {
    public static void  main (String[] args){
        Scanner myScanner01 = new Scanner(System.in);
        System.out.println("请输入字符a~e");
        char input = myScanner01.next().charAt(0);
        char upper = (char) (input - 32);
        switch (input) {
            case 'a' :
                System.out.println("a对应的大写是：" + upper);
                break;
            case 'b' :
                System.out.println("b对应的大写是：" + upper);
                break;
            case 'c' :
                System.out.println("c对应的大写是：" + upper);
                break;
            case 'd' :
                System.out.println("d对应的大写是：" + upper);
                break;
            case 'e' :
                System.out.println("e对应的大写是：" + upper);
                break;
            default:
                System.out.println("Other");
                break;
        }
    }
}
//对学生成绩大于60分的，输出“合格”。低于60分的，输出”不合格”。
// （注：输入的成绩不能大于100），
// 提示 成绩/60
//如果成绩在[60,100]，（int)（成绩/60）=1
// 如果成绩在[0,60），（int)(成绩/60）=θ
class SwitchExercise02 {
    public static void main(String[] args){
    Scanner myScanner02 = new Scanner(System.in);
    System.out.println("请输入学生成绩");
    double score = myScanner02.nextDouble();
    int rate = (int) (score / 60 ) ;
    if (score >= 0 && score <= 100) {
        switch (rate) {
            case 1:
                System.out.println("合格");
                break;
            case 0:
                System.out.println("不合格");
                break;
        }
    } else {
        System.out.println("输入有误,成绩必须在0~100之间");
    }
    }
}

//根据用于指定月份，打印该月份所属的季节.
// 3，45春季6，7，8夏季
// 9，10，11秋季12，1，2冬季
class SwitchExercise03 {
    public static void main (String[] args) {
    Scanner myScanner03 = new Scanner(System.in);
    System.out.println("请输入月份");
    int month = myScanner03.nextInt();
    switch (month) {
        case 3 :
        case 4 :
        case 5 :
            System.out.println("这是春季");
            break;
        case 6 :
        case 7 :
        case 8 :
            System.out.println("这是夏季");
            break;
        case 9 :
        case 10 :
        case 11 :
            System.out.println("这是秋季");
            break;
        case 12 :
        case 1 :
        case 2 :
            System.out.println("这是冬季");
            break;
        default:
            System.out.println("未知月份");
    }
    }
}