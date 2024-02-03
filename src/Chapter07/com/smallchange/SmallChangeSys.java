package Chapter07.com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //化繁为简
    //1. 先完成显示菜单,并可以选择菜单,给出相应的提示
    //2. 完成零钱通明细
    //3. 完成收益入账
    //4. 消费

    public static void main(String[] args) {
        //定义相关的变量
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


        do{
            System.out.println("\n====================零钱通菜单===================");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消费");
            System.out.println("\t\t\t\t4 退     出");

            System.out.println("请选择(1-4): ");
            key = scanner.next();

            //使用switch分支
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    //money的值应该校验

                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date();
                    details += "\n收益入账\t+" + money +"\t" + sdf.format(date) + "\t" + balance + "￥";
                    break;
                case "3":

                    System.out.println("消费金额");
                    money = scanner.nextDouble();
                    //money的值需要校验

                    System.out.println("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    //拼接消费信息到details
                    date = new Date();
                    details += "\n" + note +"\t-" + money + "\t" + sdf.format(date) + "\t" + balance + "￥";
                    break;
                case "4":
                    //1. 定义一个变量 choice 接收用户的输入
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
//                    if(choice.equals("y")){
//                        loop = false;
//                    }
                    break;
                default:
                    System.out.println("菜单选择有误,请重新选择");
            }
        } while (loop);
        System.out.println("===========================退出了零钱通==========================");
    }
}
