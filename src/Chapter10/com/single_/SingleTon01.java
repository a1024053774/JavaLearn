package Chapter10.com.single_;

/**
 * 饿汉式
 */
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);

    }
}

class GirlFriend {
    private String name;

    //为了能够在静态方法中，返回 gf对象，需要将其修饰为static
    private  static GirlFriend gf = new GirlFriend("小红花");
    //如何保证只能创建一个GirlFriend对象?
    //1. 将构造器私有化
    //2. 在类内部直接创建
    //3. 提供一个公共的static方法,返回gf对象
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}