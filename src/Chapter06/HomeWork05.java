package Chapter06;

import java.util.Scanner;

public class HomeWork05 {
    //5.定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        double r = scanner.nextDouble();
        circle.r = r;
        System.out.println("圆的周长是" + circle.perimeter());
        System.out.println("圆的面积是" + circle.area());

    }
}

class Circle {
    double r;
    public double perimeter(){
        return 2 * Math.PI * r;
    }
    public double area(){
        return Math.PI * r * r;
    }
}

