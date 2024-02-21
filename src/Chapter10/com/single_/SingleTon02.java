package Chapter10.com.single_;

/**
 * 懒汉式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);
        System.out.println(instance2 == instance);


    }
}
//希望在程序运行过程中,只能创建一个Cat对象
class Cat {
    private String name;
    private static Cat cat;
    //1. 私有化构造器
    //2. 定义一个静态属性static
    //3. 提供一个公共的static方法,可以返回一个cat对象
    private Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat("布丁");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
