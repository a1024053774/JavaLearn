package Chapter07.com.modifier;

public class A {

    public int n1 = 100;
    protected int n2 =200;
    int n3 = 300;
    private int n4 = 400;


    public void m1(){
        //该方法可以访问 四个属性
        //在同一个类中给,四个都能访问
        System.out.println("n1= " + n1 + " n2=" + n2+ " n3=" + n3 + " n4=" + n4);
    }

    protected void m2(){}
    void m3(){}
    private void m4(){}

    public void hi(){
        //四个方法都能调用
        m1();
        m2();
        m3();
        m4();

    }



}
