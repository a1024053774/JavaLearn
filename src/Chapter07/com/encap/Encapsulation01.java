package Chapter07.com.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack are u ok?");
        person.setAge(300);
        person.setSalary(30000);
        System.out.println(person.info());


        //如果使用构造器指定属性
        Person smith = new Person("smith", 2000, 50000);
        System.out.println("smith的信息");
        System.out.println(smith.info());
    }
}
//那么在java中如何实现这种类似的控制呢？
// 请大家看一个小程序
// 不能随便查看人的年龄，工资等隐私，
// 并对设置的年龄进行合理的验证。
// 年龄合理就设置，否则给默认年龄，
// 必须在1-120，年龄，工资不能直接查看，name的长度在2-6字符之间
class Person{
    public String name;//名字公开
    private int age;//年龄私有化
    private double salary;//工资私有化

    //构造器

    public Person() {
    }
    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以将set方法写在构造器中,这样任然可以验证数据
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    //生成getter和setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验,name的长度在2-6字符之间
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对,在2-6之间,给默认名字");
            this.name = "无名小卒";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄不对,需要在1-120之间,默认年龄18");
            this.age = 18;
        }

    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法,返回属性信息
    public String info(){
        return "个人信息为 name=" + name + " age=" + age
                + " salary=" + salary;
    }
}
