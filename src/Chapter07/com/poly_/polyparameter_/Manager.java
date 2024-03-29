package Chapter07.com.poly_.polyparameter_;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double monthSalary, double bonus) {
        super(name, monthSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("经理" + getName() + " 正在管理");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + getBonus();
    }
}
