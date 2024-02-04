package Chapter07.com.homework.hm13;

public class Student extends Person{
    private String stu_id;

    public void study(){
        System.out.println("我承诺,我会好好学习.");
    }

    public void printInfo(){
        System.out.println("学生的信息: ");
        System.out.println(super.basicInfo());
        System.out.println("学号：" + getStu_id());
        this.study();
        System.out.println(play());
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}
