package Chapter07.com.homework.hm05;

public class Scientist extends Employee{
    private double end_sal;
    public void year_sal(){
        System.out.println("教师姓名"+ getName() + " 基础工资" + getBasic_sal() + " 年终奖"
                + getEnd_sal() + " 年工资" + (super.basic_year_sal() + getEnd_sal()));
    }
    public Scientist(String name, double basic_sal, double end_sal) {
        super(name, basic_sal);
        this.end_sal = end_sal;
    }

    public double getEnd_sal() {
        return end_sal;
    }

    public void setEnd_sal(double end_sal) {
        this.end_sal = end_sal;
    }
}
