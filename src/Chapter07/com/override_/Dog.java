package Chapter07.com.override_;

public class Dog extends Animal{

    //Dog是Animal子类
    //Dog的Cry方法和Animal的cry定义的形式一样(方法名称,参数)
    //这时Dog的Cry方法重写了Animal的Cry方法
    public void cry(){
        System.out.println("小狗汪汪叫");
    }

    public String m1(){
        return null;
    }

    public void eat(){

    }
}
