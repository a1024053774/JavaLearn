package Chapter06;

public class Object {
    public static void main(String[] args) {
        //张老太养了两只猫猫：
        // 一只名字叫小白，今年3岁，白色。
        // 一只叫小花，今年100岁，花色。
        // 请编写一个程序，
        // 当用户输入小猫的名字时，
        // 就显示该猫的名字，年龄，颜色。
        // 如果用户输入的小猫名错误，则显示张老太没有这只猫猫。


        //使用面向对象解决
        //实例化一只猫
        //new Cat 创建一只猫
        //Cat cat1 = new Cat();把创建的猫赋给cat1
        //cat1就是一个对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";

        //访问对象的属性
        System.out.println("第一只猫的信息:" + cat1.name
                + cat1.age + cat1.color);
        System.out.println("第二只猫的信息:" + cat2.name
                + cat2.age + cat2.color);

    }
}

class Cat {
    String name;
    int age;
    String color;
}