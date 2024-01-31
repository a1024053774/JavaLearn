package Chapter07.com.super_;

public class B extends A{

    //访问父类的属性，但不能访问父类的private属性【案例]super.属性名
    public void hi(){
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    //访问父类的方法，不能访问父类的private方法super·方法名（参数列表）；
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }

    //访问父类的构造器
    public B(){
        //super(); 无参的
        //super("jack"); 一个参数的
        super("jack",18); //两个参数的
    }


    public void sum(){
        System.out.println("B类的sum方法");
        //希望调用父类A的cal方法
        //super,this,直接访问是一样的,因为没有重名
        cal();
        this.cal();
        super.cal();

    }
}
