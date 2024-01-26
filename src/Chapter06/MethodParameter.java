package Chapter06;

public class MethodParameter {
    public static void main(String[] args) {
        //基本数据类型
        int a = 10;
        int b = 20;
        BBasement bb = new BBasement();
        bb.swap(a,b);
        System.out.println("a=" + a + "b=" + b);

//////////////////////////////////////////////////////////
        //引用数据类型
        BReference bReference = new BReference();
        int arr[] = {1,2,3};
        bReference.test100(arr);
        System.out.println("main的arr数组");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Person02 p = new Person02();
        p.name = "jack";
        p.age = 10;

        bReference.test200(p);
        System.out.println("main的p.age" + p.age);


    }
}

class BBasement{
    //基本数据类型传参机制
    public void swap(int a, int b){
        System.out.println("交换前的值"+ a +" "+ b);
    int temp = a;
    a = b;
    b = temp;
        System.out.println("交换后的值"+ a +" "+ b);
    }
}

class BReference{
    public void test100(int arr[]){
        arr[0] = 200;
        //遍历
        System.out.println("test100的arr数组");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void test200(Person02 p){
        p.age = 10000;//修改对象属性
    }
}
class Person02{
    String name;
    int age;

}
