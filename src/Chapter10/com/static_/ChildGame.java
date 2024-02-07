package Chapter10.com.static_;

public class ChildGame {
    public static void main(String[] args) {
        //定义一个变量count,统计有多少小孩加入了游戏
//        int count = 0;
        Child child01 = new Child("白骨精");
        child01.join();
        child01.count++;
        Child child02 = new Child("狐狸精");
        child02.join();
        child02.count++;
        Child child03 = new Child("老鼠精");
        child03.join();
        child03.count++;

        //============
        System.out.println("共有" + Child.count + "小孩加入了游戏");
        System.out.println("child01.count=" + child01.count);//3
        System.out.println("child02.count=" + child02.count);//3
        System.out.println("child03.count=" + child03.count);//3
    }
}

class Child {
    private String name;
    //定义一个变量 count,是一个类变量(静态变量) static
    ////该变量最大的特点就是会被Child类的所有的对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name + "加入了游戏..");
    }
}
