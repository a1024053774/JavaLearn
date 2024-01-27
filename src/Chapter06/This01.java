package Chapter06;


public class This01 {

    //编写一个main方法
    public static void main(String[] args) {
        Doggy dog1 = new Doggy("大壮", 3);
        System.out.println("dog1的hashCode" + dog1.hashCode());
        dog1.info();

        Doggy dog2 = new Doggy("大黄", 2);
        System.out.println("dog2的hashCode" + dog2.hashCode());
        dog2.info();
    }
}

class Doggy{ //类
    String name;
    int age;
     public Doggy(String name, int  age){//构造器
     	//this.name就是当前对象的属性
         this.name = name;
         this.age = age;
     }
     //如果构造器形参能直接写成属性名就更好了==>this关键字
    public void info(){//成员方法,输出属性信息
        System.out.println("this.hashCode=" + this.hashCode());
        System.out.println(name + "\t" + age + "\t");
    }



}

