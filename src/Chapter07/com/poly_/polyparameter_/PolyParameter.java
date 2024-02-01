package Chapter07.com.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        PolyParameter polyParameter = new PolyParameter();
        Worker zhangSan = new Worker("张三", 2500);
        Manager laoLi = new Manager("老李", 8000, 200000);
        System.out.println(polyParameter.showEmpAnnual(zhangSan));
        System.out.println(polyParameter.showEmpAnnual(laoLi));
        polyParameter.testWork(zhangSan);
        polyParameter.testWork(laoLi);
    }

   public double showEmpAnnual(Employee e){
        return e.getAnnual();
   }
   public void testWork(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manager){
            ((Manager) e).manage();
        } else {
            System.out.println("不做处理");
        }
   }
}
