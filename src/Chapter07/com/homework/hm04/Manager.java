package Chapter07.com.homework.hm04;

public class Manager extends Employee {
    private double level;

    @Override
    public void printSal(){
        double total_sal = getDay_sal() * getWork_days();
        System.out.println("部门经理姓名" + getName() + " 日工资" + getDay_sal() + " 工作天数" + getWork_days() + " 总工资" + (total_sal * getLevel() + 1000));
    }

    public Manager(String name, double day_sal, int work_days, double level) {
        super(name, day_sal, work_days);
        this.level = level;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
}
