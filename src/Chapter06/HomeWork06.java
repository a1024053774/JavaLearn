package Chapter06;

public class HomeWork06 {
    //6.编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象，分别测试
    public static void main(String[] args) {
        Cale cale = new Cale();
        double sum = cale.sum(3.3, 5.7);
        double diminish = cale.diminish(4.7, 3.1);
        double plus = cale.plus(3.1, 9.8);
        double divide = cale.divide(9, 3);
        System.out.println("sum=" + sum);
        System.out.println("diminish=" + diminish);
        System.out.println("plus=" + plus);
        System.out.println("divide=" + divide);

        Cale cale02 = new Cale();
        try {
            double divide02 = cale.divide(9, 0);
            System.out.println("divide02=" + divide02);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // 打印异常信息
        }
    }
}

class Cale{

    public double sum(double n1,double n2){
        return n1 + n2;
    }
    public double diminish(double n1,double n2){
        return n1 - n2;
    }
    public double plus(double n1,double n2){
        return n1 * n2;
    }
    public double divide(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("除数不能为0");
        } else {
            return n1 / n2;
        }
    }
}

