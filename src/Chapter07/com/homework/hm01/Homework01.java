package Chapter07.com.homework.hm01;

/**
 * 1.定义一个Person类{name，age,job},
 * 初始化Person对象数组，有3个person对象，
 * 并按照age从大到小进行排序，提示，使用冒泡排序Homework01.java
 */
public class Homework01 {
    //定义一个Person类{name,age,job},初始化Person对象数组，有3个person对象，并按照age从大到小进行排序，提示，使用冒泡排序
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Jac", 19, "歌手");
        persons[1]= new Person("Mate", 43, "老师");
        persons[2] = new Person("Kobe", 34, "运动员");

        Person temp = null;
        for (int i = 0;i < persons.length - 1 ;i++){
            for (int j = 0;j < persons.length - 1 -i;j++){
                if (persons[i].getAge() < persons[i+1].getAge()){
                    temp = persons[i];
                    persons[i] = persons[i+1];
                    persons[i+1] = temp;
                }
            }
        }

        for (int i= 0; i< persons.length;i++){
            System.out.println(persons[i]);
        }



    }

}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
