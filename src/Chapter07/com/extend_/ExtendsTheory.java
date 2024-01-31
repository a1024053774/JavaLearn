package Chapter07.com.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        //-> 按照查找关系来返回信息
        /*
        1.先看子类是否有该属性
        2.若有,并且可以访问,则返回信息
        3.若子类没有,就看父类有没有这个属性(并且可以访问,就返回信息)
        若没有,依次往上.........
        优先访问最近的
         */
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}
class Father extends GrandPa {
    String name = "大头爸爸";
    int age = 39;
}

class Son extends Father {
    String name = "大头儿子";
}
