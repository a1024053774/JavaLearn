package Chapter07.com.homework.hm05;

public class Worker extends Employee{


    public void year_sal(){
        System.out.println("工人姓名"+ getName() + " 基础工资" + getBasic_sal() + " 年工资" + super.basic_year_sal());
    }
    public Worker(String name, double basic_sal) {
        super(name, basic_sal);
    }
}
