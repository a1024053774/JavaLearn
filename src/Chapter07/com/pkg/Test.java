package Chapter07.com.pkg;

import Chapter07.com.modifier.A;

public class Test {
    public static void main(String[] args) {
        //不同包只能访问public修饰的属性或方法
        A a = new A();
        System.out.println(a.n1);

        a.m1();
    }
}
