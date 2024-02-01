package Chapter07.com.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person persons[] = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("white",18,100);
        persons[2] = new Student("taylor",19,99);
        persons[3] = new Teacher("what",45,8000);
        persons[4] = new Teacher("where",35,10000);

        for (int i = 0;i < persons.length;i++){
            //persons[i]的编译类型是Person,运行类型是根据自己创建的每个
            System.out.println(persons[i].say());

        }
    }
}
