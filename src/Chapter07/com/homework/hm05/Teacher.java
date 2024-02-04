package Chapter07.com.homework.hm05;

public class Teacher extends Employee{
    private double class_sal;
    private int work_days;
    public void year_sal(){
        System.out.println("教师姓名"+ getName() + " 基础工资" + getBasic_sal() + "课酬"
                + getClass_sal() + " 年工资" + (super.basic_year_sal() + getClass_sal() * getWork_days()));
    }

    public double getClass_sal() {
        return class_sal;
    }

    public void setClass_sal(double class_sal) {
        this.class_sal = class_sal;
    }

    public int getWork_days() {
        return work_days;
    }

    public void setWork_days(int work_days) {
        this.work_days = work_days;
    }

    public Teacher(String name, double basic_sal, double class_sal, int work_days) {
        super(name, basic_sal);
        this.class_sal = class_sal;
        this.work_days = work_days;
    }
}
