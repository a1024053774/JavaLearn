package Chapter10.com.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.area());
    }
}

class Circle{
    private double radius;
    private final double PI;  //= 3.14    声明时赋值

    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14;    构造器赋值
    }
    {
        PI = 3.14;//代码块赋值
    }
    public double area(){
        return PI * radius * radius;
    }
}
