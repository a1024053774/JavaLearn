package Chapter06;

public class OverLoadExercise {
    public static void main(String[] args) {

        Overload_exercise overloadExercise = new Overload_exercise();
        overloadExercise.m(1);
        overloadExercise.m(1,2);
        overloadExercise.m("Hello");

        Overload_exercise2 overloadExercise2 = new Overload_exercise2();
        int result1 = overloadExercise2.max(1,2);
        double result2 = overloadExercise2.max(1.1,2);
        double result3 = overloadExercise2.max(1.1,2.2,3.3);
        System.out.println("两个int的最大值=" + result1);
        System.out.println("两个double的最大值=" + result2);
        System.out.println("三个double的最大值=" + result3);
    }
}

class Overload_exercise{
    public void m(int n1){
        System.out.println("平方="+ (n1 * n1));
    }
    public void m(int n1,int n2){
        System.out.println("相乘="+ (n1 * n2));
    }
    public void m(String n1){
        System.out.println("字符串="+ n1);
    }

}

class Overload_exercise2{
    public int max(int n1,int n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1,double n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1,double n2,double n3){
        return max(max(n1,n2),n3);
    }
}
