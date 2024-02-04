package Chapter07.com.homework.hm04;

/**
 * 通过继承实现员工工资核算打印功能父类：员工类子类：部门经理类、普通员工类
 * （1）部门经理工资=1000+单日工资*天数*等级（1.2）。
 * (2）普通员工工资=单日工资*天数*等级（1.0）；
 * (3）员工属性：姓名，单日工资，工作天数
 * (4）员工方法 (打印工资）（
 * 5）普遍员工及部门经理都是员工子类，需要重写打印工资方法。
 * （5）定义并初始化普通员工对象，调用打印工资方法输入工资，定义并初始化部门经理对象，调用打印工资方法输入工资
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Manager manager = new Manager("老王", 1000, 300, 1.2);
        Normal normal = new Normal("小李", 600, 200, 1.0);
        manager.printSal();
        normal.printSal();
    }
}

class Employee{
    private String name;
    private double day_sal;
    private int work_days;

    public void printSal(){
        double total_sal = day_sal * work_days;
        System.out.println("员工姓名" + this.name + " 日工资" + day_sal + " 工作天数" + work_days + " 总工资" + total_sal);
    }

    public Employee(String name, double day_sal, int work_days) {
        this.name = name;
        this.day_sal = day_sal;
        this.work_days = work_days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDay_sal() {
        return day_sal;
    }

    public void setDay_sal(double day_sal) {
        this.day_sal = day_sal;
    }

    public int getWork_days() {
        return work_days;
    }

    public void setWork_days(int work_days) {
        this.work_days = work_days;
    }
}
