package Chapter06;

public class VarScope {
    public static void main(String[] args) {
        Person_1 person1 = new Person_1();
        person1.say();
    }
}

class Catty{
    //全局变量 age
    //属性在定义时可以直接赋值
    int age = 10;

    double weight; // 默认值是0.0
    public void hi() {
        int num = 0;
        System.out.println(num);
    }

    public void eat() {
        System.out.println(age);
    }

    public void say() {
        //1. 局部变量一般指在成员方法中定义的变量
        //2. n 和 name就是局部变量
        //3. n 和 name作用域只在cry方法中
        int n = 10;
        String name = "jack";
        System.out.println(age);

    }
}


class Person_1{
    String name = "jack";
    public void say(){
        String name = "king";
        System.out.println(name);
    }

    public void hi(){
        String address = "Beijing";
        String address = "nanjing";

    }
}
