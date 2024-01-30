package Chapter07.com.modifier;

public class B {
    public void say(){
        A a = new A();
        //相同包下
        //不能访问private
        System.out.println("n1= " + a.n1 + " n2=" + a.n2+ " n3=" + a.n3);

        //方法
        a.m1();
        a.m2();
        a.m3();
    }
}
