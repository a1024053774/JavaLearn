package Chapter06;

public class ConstructorDetail {
    public static void main(String[] args) {
        People02 p1 = new People02("king", 40);
        People02 p2 = new People02("tom");

        Dog dog1 = new Dog();//使用的是默认的无参构造器

    }
}

class People02{
    String name;
    int age;
    //=============构造器重载============
    //第一个构造器
    public People02(String pName,int pAge){
        name = pName;
        age = pAge;
    }
    //第二个构造器
    public People02(String pName){
        name = pName;
    }
}


class Dog{
    public Dog(String dName){
    }
    public Dog(){
        //显式定义构造器
    }
}

