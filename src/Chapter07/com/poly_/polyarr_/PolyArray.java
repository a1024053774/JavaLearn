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
            //============执行子类的特有方法=============
            if (persons[i] instanceof Student){
                //判断person[i]的运行类型是不是Student
                Student student = (Student)persons[i];//向下转型
                student.study();
                //也可以这样
                ((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            } else if(persons[i] instanceof Person){

            } else {
                System.out.println("类型有误");
            }
        }
    }
}
