package Chapter07.com.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通各个功能的类,使用面向对象编程
 * 将各个功能对应一个方法
 */

public class SmallChangeSysOOP {
    //属性
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //2. 完成零钱通明细
    // 1)可以把收益入账和消费,保存到数组 2)可以使用对象 3)使用String拼接
    String details = "----------------------零钱通明细-------------------";

    //3. 完成收益入账
    //定义新的变量
    double money = 0;
    double balance = 0;
    Date date = null;//java.util.Date 表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化

    //4. 消费
    //定义新变量,保存消费的原因
    String note = "";

    public void mainMenu(){
        do{
            System.out.println("\n====================选择零钱通菜单(OOP)====================");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消费");
            System.out.println("\t\t\t\t4 退     出");

            System.out.println("请选择(1-4): ");
            key = scanner.next();

            //使用switch分支
            switch (key){
                case "1":
                    this.detail();
                    break;

                case "2":
                    this.income();
                    break;

                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误,请重新选择");
            }
        } while (loop);
        System.out.println("===========================退出了零钱通==========================");
    }

    //零钱通明细
    public void detail(){
        System.out.println(details);
    }
    public void income(){
        System.out.println("收益入账金额:");
        money = scanner.nextDouble();
        //money的值应该校验
        if (money <= 0){
            System.out.println("收入应该大于0");
            return;//退出方法,不再执行后面的代码
        }

        balance += money;
        //拼接收益入账信息到details
        date = new Date();
        details += "\n收益入账\t+" + money +"\t" + sdf.format(date) + "\t" + balance + "￥";
    }
    public void pay(){
        System.out.println("消费金额");
        money = scanner.nextDouble();
        //money的值需要校验
        if ( money <= 0 || money > balance){
            System.out.println("消费的金额应该在0~" + balance + "之间");
            return;
        }
        System.out.println("消费说明:");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到details
        date = new Date();
        details += "\n" + note +"\t-" + money + "\t" + sdf.format(date) + "\t" + balance + "￥";
    }

    public void exit(){
        String choice = "";
        while (true){
            System.out.println("你确定要退出嘛? y/n");
            choice = scanner.next();
            if("y".equals(choice)){
                loop = false;
                break;
            } else if ("n".equals(choice)){
                break;
            }
        }
    }

}
