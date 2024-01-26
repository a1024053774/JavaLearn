package Chapter06;

public class Recursion01 {
    public static void main(String[] args) {
        T t1 = new T();
        t1.test(4);

        int res = t1.factorial(5);
        System.out.println(res);
    }
}

class T{
    public void test(int n){//打印问题
        if ( n > 2){
            test(n - 1);
        }
        System.out.println("n=" + n);
    }


    public int factorial(int n){//阶乘问题
        if (n == 1){
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
