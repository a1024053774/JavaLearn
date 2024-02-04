package Chapter07.com.homework.hm10;

/**
 * 10.编写Doctor类{name,age,job,gender,sal}相应的getter0和setter0方法，5个参数的构造器，
 * 重写父类的equals方法：public boolean equals（Object obj），并判断测试类中创建的两个对象是否相等。相等就是判断属性是否相同
 */
public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", 20, "牙科", '男', 20000);
        Doctor doctor2 = new Doctor("jack", 21, "牙科", '男', 20000);
        System.out.println(doctor1.equals(doctor2));
    }

}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char sex;
    private double sal;

    public boolean equals(Object obj){
        if (this == obj){//判断两个对象是否相同
            System.out.println("两个类相等");
            return true;
        }
        if(!(obj instanceof Doctor)) {//判断obj的运行类型是否是Doctor或子类型
            return false;
        }

        //向下转型,因为obj的运行类型是Doctor或子类型
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.age == doctor.age &&
                this.job.equals(doctor.job) && this.sex == doctor.sex && this.sal == doctor.sal;


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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Doctor(String name, int age, String job, char sex, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.sex = sex;
        this.sal = sal;
    }
}