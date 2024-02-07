package Chapter08.com.houserent.utils;

public class TestUtility {
    public static void main(String[] args) {
        //这是一个测试类
        //要求输入一个字符串,长度最大为3
        String s = Utility.readString(3);
        System.out.println(s);

        //输入为空,则返回默认值
        String s2 = Utility.readString(10, "uutsy");
        System.out.println(s2);

        //当一个方法时static时,就是一个静态方法,可以通过类名直接调用
        A.cry();
        //A.hi();
    }
}

class A {
    public void hi(){

    }
    public static void cry(){

    }
}
