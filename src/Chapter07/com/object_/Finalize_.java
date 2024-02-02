package Chapter07.com.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null;//这是car对象没有指向,垃圾回收器会回收(销毁)对象,不是立即
        //在销毁对象前,会调用该对象的finalize方法,
        //可以重写此方法,(数据库连接,或者打开文件...)
        System.gc();


    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车" + name);
        System.out.println("释放了某些资源...");

    }

}