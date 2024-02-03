package Chapter07.com.homework.hm01;

/**
 * 1.定义一个Person类{name，age,job},
 * 初始化Person对象数组，有3个person对象，
 * 并按照age从大到小进行排序，提示，使用冒泡排序Homework01.java
 */
public class Homework01 {
    //定义一个Person类{name,age,job},初始化Person对象数组，有3个person对象，并按照age从大到小进行排序，提示，使用冒泡排序
    public static void main(String[] args) {
        Person jac = new Person("Jac", 19, "歌手");
        Person mate = new Person("Mate", 43, "老师");
        Person kobe = new Person("Kobe", 34, "运动员");

        int array[] = {jac.getAge(),mate.getAge(),kobe.getAge()};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == jac.getAge()) {
                System.out.println(jac);
            } else if (array[i] == mate.getAge()) {
                System.out.println(mate);
            } else if (array[i] == kobe.getAge()) {
                System.out.println(kobe);
            }
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
