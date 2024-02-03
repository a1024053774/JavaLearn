package Chapter07.com.homework.hm03;

/**
 * 3.编写老师类 Homework03.java
 * （1）要求有属性“姓名name”，“年龄age"！“职称post"，“基本工资salary"
 * (2)编写业务方法，introduce（），实现输出一个教师的信息。
 * (3）编写教师类的三个子类：教授类、副教授类、讲师类。工资级别分别为：教授为1.3、副教授为1.2、讲师类1.1。
 * 在三个子类里面都重写父类的introduce（）方法。
 * (4）定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印.
 */
public class Homework03 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jac", 28, "教授", 8000, 1.3);
        AssociateProfessor associateProfessor = new AssociateProfessor("Yasuo", 38, "副教授", 7000, 1.2);
        Lecturer lecturer = new Lecturer("Ding", 42, "讲师", 6000, 1.1);
        professor.introduce();
        associateProfessor.introduce();
        lecturer.introduce();
    }

}

class Teacher {
    private String name;
    private int age;
    //职称
    private String post;
    private double salary;

    public void introduce(){
        System.out.println("姓名：" + getName() + ", 年龄：" + getAge() + ", 职称：" + getPost() + ", 基本工资：" + getSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
}
