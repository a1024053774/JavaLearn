package Chapter07.com.object_;

public class Equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true

        B bObj = a;
        System.out.println(bObj == c);//true



        "hello".equals("abc");
    }
}

class B{}
class A extends B{}