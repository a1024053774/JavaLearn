package Chapter06;

public class HomeWork12 {
    //创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），
    // 提供3个构造方法，可以初始化
    // （1）（名字，性别，年龄，职位，薪水)，
    // （2）（名字，性别，年龄）
    // （3)（职位，薪水），要求充分复用构造器
    public static void main(String[] args) {
        Employee employee1 = new Employee("张三","男",18,"初级",1000);
        Employee employee2 = new Employee("李四","女",20);
        Employee employee3 = new Employee("高级",2000);

    }
}

class Employee{
    String name;
    String sex;
    int age;
    String level;
    double salary;

    public Employee(String name,String sex,int age,String level,double salary){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.level = level;
        this.salary = salary;
        System.out.println("创建了Employee：name=" + name + ", sex=" + sex + ", age="
                            + age + ", level=" + level + ", salary=" + salary);
    }
    public Employee(String name, String sex, int age){
        this(name,sex,age,"",0.0);
    }
    public Employee(String level,double salary){
        this("", "", 0, level, salary);
    }

}