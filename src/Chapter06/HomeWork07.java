package Chapter06;

public class HomeWork07 {
    //7.设计一个Dog类，有名字、颜色和年龄属性，定义输出方法showO显示其信息。并创建对象，进行测试、【提示this.属性】
    public static void main(String[] args) {
        Dog_gg dog = new Dog_gg();
        dog.name = "旺财";
        dog.color = "黄色";
        dog.age = 3;
        dog.showO();
    }
}

class Dog_gg{
    String name;
    String color;
    int age;

    public void showO(){
        System.out.println("名字是" + this.name + " 颜色是" + this.color + " 年龄是" + this.age);
    }
}
