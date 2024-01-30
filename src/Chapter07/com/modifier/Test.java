package Chapter07.com.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();
        a.m3();
        B b = new B();
        b.say();
    }
}


//只有默认和public 可以修饰类
class Tiger1{ }
