package Chapter07.com.poly_.polyparameter_;

public class Worker extends Employee{
    public Worker(String name, double monthSalary) {
        super(name, monthSalary);
    }

    public void work(){
        System.out.println("员工" + getName() + " 正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
