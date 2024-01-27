package Chapter06;

public class ConstructorExercise {
    public static void main(String[] args) {

        Person_person p1 = new Person_person();
        System.out.println(p1.name + p1.age);

        Person_person p2 = new Person_person("zhangSan", 22);
        System.out.println(p2.name + p2.age);


    }
}

class Person_person {
    int age;
    String name;
    public Person_person(){
        age = 18;
    }

    public Person_person(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}