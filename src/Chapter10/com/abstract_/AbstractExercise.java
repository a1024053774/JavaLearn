package Chapter10.com.abstract_;

public class AbstractExercise {
    public static void main(String[] args) {
        Manager zhang = new Manager("张飞", "88888", 19999, 88888);
        CommonEmployee liu = new CommonEmployee("刘备", "99999", 12345);
        zhang.work();
        liu.work();
    }
}

abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract public void work();
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中" + " 工资是" + (getSalary() + bonus));
    }
}
class CommonEmployee extends Employee{
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中");
    }
}
