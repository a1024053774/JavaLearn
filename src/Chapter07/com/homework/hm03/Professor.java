package Chapter07.com.homework.hm03;

public class Professor extends Teacher {
    private double SalaryLevel;
    public void introduce(){
        double finalSalary = this.getSalary() * this.getSalaryLevel();
        System.out.println("姓名：" + getName() + ", 年龄：" + getAge() + ", 职称：教授, 基本工资：" + getSalary() + ", 工资级别：" + SalaryLevel + ", 最终工资：" + finalSalary);
    }

    public Professor(String name, int age, String post, double salary, double salaryLevel) {
        super(name, age, post, salary);
        SalaryLevel = salaryLevel;
    }

    public double getSalaryLevel() {
        return SalaryLevel;
    }

    public void setSalaryLevel(double salaryLevel) {
        SalaryLevel = salaryLevel;
    }

}
