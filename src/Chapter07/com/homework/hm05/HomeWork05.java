package Chapter07.com.homework.hm05;

/**
 * 设计父类一员工类。子类：工人类，农民类，教师类，科学家类，服务生类
 * （1）其中工人，农民，服务生只有基本工资
 * （2）教师除基本工资外，还有课酬（元/天）
 * （3）科学家除基本工资外，还有年终奖
 * （4）编写一个测试类，将各种类型的员工的全年工资打印出来
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Employee employee = new Worker("工人", 5000);
        employee.year_sal();
        employee = new Farmer("农民",6000);
        employee.year_sal();
        employee = new Waiter("服务员",3000);
        employee.year_sal();
        employee = new Teacher("教师",4000,12,240);
        employee.year_sal();
        employee = new Scientist("教授",4500,100000);
        employee.year_sal();

    }
}
class Employee{
    private String name;
    private double basic_sal;

    public double basic_year_sal(){
        return this.basic_sal * 12;
    }

    public void year_sal(){

    }
    public Employee(String name, double basic_sal) {
        this.name = name;
        this.basic_sal = basic_sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasic_sal() {
        return basic_sal;
    }

    public void setBasic_sal(double basic_sal) {
        this.basic_sal = basic_sal;
    }
}
