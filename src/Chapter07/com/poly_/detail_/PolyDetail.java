package Chapter07.com.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型: 父类的引用指向子类的对象
        Animal animal = new Cat();

        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        //向下转型
        //编译类型和运行类型都成了Cat
        Cat cat = (Cat)animal;
        cat.catchMouse();

    }
}
