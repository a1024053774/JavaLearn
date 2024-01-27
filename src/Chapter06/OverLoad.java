package Chapter06;

public class OverLoad {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.calculate(1, 2));
        System.out.println(myCalculator.calculate(1.1, 2));
    }
}

class MyCalculator {
    //下面四个calculate构成了重载
   public int calculate(int n1, int n2) {
       System.out.println("int n1,int n2 被调用");
       return n1 + n2;
    }
    public double calculate(double n1,int n2) {
        System.out.println("double n1,int n2 被调用");
        return n1 + n2;
    }
}