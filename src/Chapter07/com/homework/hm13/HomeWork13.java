package Chapter07.com.homework.hm13;

/**
 * 案例题目描述：（1）做一个Student类，Student类有名称（name），性别（sex)，年龄（age），学号（stu_id），做合理封装，通过构造器在创建对象时将4个属性赋值。
 * (2)写一个Teacher类，Teacher类有名称（name），性别（sex），年龄（age），工龄（work_age)，做合理封装，通过构造器在创建对象时将4个属性赋值。
 * (3）抽取一个父类Person类，将共同属性和方法放到Person类
 * （4）学生需要有学习的方法（study），在方法里写生“我承诺，我会好好学习。”。
 * （5）教师需要有教学的方法（teach），在方法里写上“我承诺，我会认真教学。"
 * （6）学生和教师都有玩的方法（play），学会玩的是足球，老师玩的是象棋，此方法是返回字符串的，
 * 分别返回“xx爱玩足球”和“xx爱玩象棋”（其中xx分别代表学生和老师的姓名）。因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
 *  * 保证输出结果如下
 *  * 输出结果是
 *  *
 *  * 老师的信息：
 *  * 姓名：王飞
 *  * 年龄：30
 *  * 性别：男
 *  * 工龄：5
 *  * 我承诺，我会认真教课。
 *  * 王飞爱玩象棋
 *  * ----------------------------------
 *  * 学生的信息：
 *  * 姓名：小明
 *  * 年龄：15
 *  * 性别：男
 *  * 学号：00023102
 *  * 我承诺，我会好好学习。
 *  * 小明爱玩足球。
 * （7）定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序，
 * （8）定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
 *

 */
public class HomeWork13 {
    public static void main(String[] args) {
        Student student = new Student("小张", '男', 17, "00023333");
        Teacher teacher = new Teacher("大张", '女', 37, 17);
        student.printInfo();
        System.out.println("-------------------------------");
        teacher.printInfo();


        Person[] persons = new Person[4];
        persons[0] = new Student("小明", '男', 15, "00023102");
        persons[1] = new Student("小红", '女', 14, "00023103");
        persons[2] = new Teacher("王飞", '男', 30, 5);
        persons[3] = new Teacher("李娜", '女', 28, 3);

        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.bubbleSort(persons);

        for (int i = 0;i < persons.length;i++){
            System.out.println(persons[i]);
        }


        //定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
        System.out.println("=======================");
        for (int i = 0;i < persons.length;i++){
            homeWork13.mission8(persons[i]);
        }

    }
    public void mission8(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("do nothing...");
        }
    }
    public void bubbleSort(Person[] persons){
        // 使用冒泡排序法按年龄从高到低排序
            for (int i = 0; i < persons.length - 1; i++) {
                for (int j = 0; j < persons.length - 1 - i; j++) {
                    if (persons[j].getAge() < persons[j + 1].getAge()) {
                        // 交换元素
                        Person temp = persons[j];
                        persons[j] = persons[j + 1];
                        persons[j + 1] = temp;
                    }
                }
            }

    }
}



class Person{
    private String name;
    private char sex;
    private int age;

    public String play(){
        return this.name + " 爱玩";
    }

    public String basicInfo(){
        return "姓名: " + name + "\n年龄: " + age + "\n性别: " + sex;
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
