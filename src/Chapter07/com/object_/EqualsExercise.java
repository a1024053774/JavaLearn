package Chapter07.com.object_;

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 19, '男');
        Person person2 = new Person("jac", 19, '男');
        System.out.println(person1.equals(person2));
    }
}



class Person{
    private String name;
    private int age;
    private char gender;


    //重写Object的euqals方法
    public boolean equals(Object obj){
        //判断如果比较的两个对象是同一个对象,则直接返回true
        if (this == obj){
            return true;
        }
        //类型的判断
        if(obj instanceof Person) {//是person才比较
            //进行类型转换(向下转型)    因为要得到obj的各个属性
            //将父类的引用转换为子类的引用
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
