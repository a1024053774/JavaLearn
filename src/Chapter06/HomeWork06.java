package Chapter06;

public class HomeWork06 {
    //6.编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象，分别测试
    public static void main(String[] args) {
        Cale cale = new Cale(23.5,0);
        double sum = cale.sum();
        double diminish = cale.diminish();
        double plus = cale.plus();



        System.out.println("sum=" + sum);
        System.out.println("diminish=" + diminish);
        System.out.println("plus=" + plus);
        Double divide = cale.divide();
        if(divide != null){
            System.out.println("divide=" + divide);
        }


    }
}

class Cale{
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum(){
        return num1 + num2;
    }
    public double diminish(){
        return num1 - num2;
    }
    public double plus(){
        return num1 * num2;
    }
    public Double divide() {
        if (num2 == 0) {
            System.out.println("除数不能为0");
            return null;
        } else {
            return num1 / num2;
        }
    }
}

