package Chapter07.com.poly_.polyparameter_;

public class Worker extends Employee{
    public Worker(String name, double monthSalary) {
        super(name, monthSalary);
    }
    public void work(){
        System.out.println("普通员工" + getName() + " is working");
    }

    @Override
    public double getAnnual() {//因为普通员工没有其他收入,直接调用父类
        return super.getAnnual();
    }
}
