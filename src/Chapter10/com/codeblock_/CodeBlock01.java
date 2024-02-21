package Chapter10.com.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("hello");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //下面三个构造器都有相同的语句
    //可以把相同的语句放入一个代码块中即可
    //不管调用哪个构造器,都会先调用代码块的内容
    //代码块调用的顺序优先于构造器
    {
        System.out.println("电影屏幕打开...");
        System.out.println("电影正式开始");
    }
    public Movie(String name) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("电影正式开始");
        System.out.println("姓名构造器被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}