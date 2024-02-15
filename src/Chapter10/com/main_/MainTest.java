package Chapter10.com.main_;

public class MainTest {
    private static String name = "hhhhh";
    public static void hi(){
        System.out.println("hi方法");
    }
    private int n1 = 10000;
    public static void main(String[] args){
        System.out.println(name);
        hi();

        //静态方法main不能访问本类的非静态成员
        //System.out.println(n1);//错误
        //创建对象后可以用
        MainTest mainTest = new MainTest();
        System.out.println(mainTest.n1);
    }
}
