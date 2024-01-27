package Chapter06;

public class TestPerson {
    public static void main(String[] args) {
        //定义Person类，里面有name、age属性，
        // 并提供compareTo比较方法，用于判断是否和另一个人相等，
        // 提供测试类TestPerson用于测试，
        // 名字和年龄完全一样，就返回true，否则返回false

        P_person p1 = new P_person("mary", 20);
        P_person p2 = new P_person("smith", 30);
        System.out.println("比较结果" + p1.compareTo(p2));

    }
}

class P_person {
    String name;
    int age;
    public P_person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(P_person p){
//        if(this.name.equals(p.name) && this.age == p.age){
//            return true;}
//        else {
//            return false;
//        }
        return this.name.equals(p.name) && this.age == p.age;

    }

}
