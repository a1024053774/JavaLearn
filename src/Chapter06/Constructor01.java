package Chapter06;

public class Constructor01 {
    public static void main(String[] args) {
        //但我们new一个对象时,直接通过构造器指定名字和年龄
        Person_02 person02 = new Person_02("smith",80);
        System.out.println("p1对象name=" + person02.name);
        System.out.println("p1对象name=" + person02.age);
    }
}


class Person_02{
    String name;
    int age;
    //构造器
    //没有返回值,不能写void
    //构造器名称要和类名一样
    //(String pName, int pAge)是形参列表

    public Person_02(String pName, int pAge){
        System.out.println("构造器被调用,完成对象属性的初始化");
        name = pName;
        age = pAge;
    }
}
