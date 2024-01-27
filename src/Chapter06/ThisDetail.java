package Chapter06;

public class ThisDetail {
    public static void main(String[] args) {
        P p = new P();
        p.f2();

        

    }
}

class P{
    public void f1(){
        System.out.println("f1()方法..");
    }

    public void f2(){
        System.out.println("f2()方法..");
        //调用本类的f1
        //1
        f1();
        //2
        this.f1();
    }

    //访问构造器 :this(参数列表)
    //必须放置在第一句
    public P(){
        this("jack",100);
        System.out.println("P()构造器");
    }

    public P(String name,int age){
        System.out.println("P(String name,int age) 构造器");
    }
}
