package Chapter07.com.super_;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void test100() {    }
    protected void test200() {    }
    void test300() {    }
    private void test400() {    }

    //构造器
    public A(){}
    public A(String name){}
    public A(String name, int age){}

    public void cal(){
        System.out.println("A类的cal方法");
    }
}
