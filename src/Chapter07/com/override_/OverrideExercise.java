package Chapter07.com.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person taylor = new Person("taylor", 22);

        Student swift = new Student("swift", 18, "88888", 66.6);

        System.out.println(taylor.say());

        System.out.println(swift.say());


    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String say(){
        return "名字是" + name + " 年龄是" + age;
    }
}

class Student extends Person{
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return super.say() +  " id是" + id + " 分数是" + score;
    }
}