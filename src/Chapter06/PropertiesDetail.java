package Chapter06;

public class PropertiesDetail {
    public static void main(String[] args) {

        //new Person() 创建的对象空间(数据)才是真正的对象
        Person01 p1 = new Person01();
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p1.isPass);
        System.out.println(p1.sal);

    }
}



class Person01{
    int age;
    String name;
    double sal;
    boolean isPass;
}
