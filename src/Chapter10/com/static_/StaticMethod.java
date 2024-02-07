package Chapter10.com.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu1 = new Stu("ding");
        stu1.pay(100);
        Stu mary = new Stu("mary");
        Stu.pay(200);
        //输出当前收到的总学费
        Stu.showFee();
    }
}

class Stu {
    private String name;
    //定义一个静态变量,来累计学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    //静态方法就可以访问静态属性/变量
    public static void pay(double fee) {
        Stu.fee += fee;//累计
    }
    public static void showFee(){
        System.out.println("总学费有" + Stu.fee);
    }
}
