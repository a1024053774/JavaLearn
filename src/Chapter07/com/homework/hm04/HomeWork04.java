package Chapter07.com.homework.hm04;

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
