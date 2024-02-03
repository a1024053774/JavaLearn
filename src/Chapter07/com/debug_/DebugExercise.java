package Chapter07.com.debug_;


//debug对象创建的过程
public class DebugExercise {
    public static void main(String[] args) {
        //创建对象的流程
        //1.加载erson类信息
        //2.默认初始化  显示初始化     构造器初始化
        //3.返回对象地址
        Person jack = new Person("jack", 20);
        System.out.println(jack);

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
