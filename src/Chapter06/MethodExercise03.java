package Chapter06;

public class MethodExercise03 {
    //编写一个方法copyPerson，可以复制一个Person对象，
    // 返回复制的对象。
    // 克隆对象注意要求得到新对象和原来的对象
    // 是两个独立的对象，只是他们的属性相同
    public static void main(String[] args) {
        People p1 = new People();
        p1.name = "milan";
        p1.age = 100;

        MyTools03 tools03 = new MyTools03();
        People p2 = tools03.copyPerson(p1);

        System.out.println("p1的属性" + p1.age + p1.name);
        System.out.println("p2的属性" + p2.age + p2.name);
        //可以通过比较对象来看对象是否是同一个
        System.out.println(p1 == p2);



    }
}

class People{
    String name;
    int age;
}

class MyTools03{
    //方法的返回类型 People
    //方法的名字 copyPerson
    //方法的形参(People p1)
    //方法体,创建一个新对象,并复制属性,返回
    public People copyPerson(People p1){
        //创建一个新的对象
        People p2 = new People();
        p2.name = p1.name;
        p2.age = p1.age;

        return p2;
    }

}