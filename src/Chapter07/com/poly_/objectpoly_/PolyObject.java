package Chapter07.com.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态

        //animal编译类型是Animal,  运行类型 Dog
        Animal animal = new Dog();
        animal.cry(); //看运行的是什么,执行到该行时,animal运行类型是Dog

        //编译类型是Animal,运行类型是Cat,因为把animal指针指向了Cat对象
        animal = new Cat();
        animal.cry();
    }
}
