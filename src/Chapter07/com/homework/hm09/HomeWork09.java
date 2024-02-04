package Chapter07.com.homework.hm09;

/**
 * 9.设计一个Point类，其x和y坐标可以通过构造器提供。
 * 提供一个子类LabeledPoint，其构造器接受一个标签值和x,y坐标，
 * 比如：newLabeledPoint（“BlackThursday”，1929，230.07），写出对应的构造器即可Homework09.java
 */
public class HomeWork09 {
    public static void main(String[] args) {
        LabeledPoint blackThursday = new LabeledPoint( "Black Thursday",1929, 230.07);
    }
}

class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
