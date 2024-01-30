package Chapter07;

public class ArrayTest {
    public static void main(String[] args) {

        MyTools myTools = new MyTools();
        int arr[] = {10, -1, 8, 0, 34};
        myTools.bubble(arr);
        System.out.println("===排序后的数组===");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//创建一个类MyTooLs，编写一个方法，可以完成对int数组冒泡排序的功能
class MyTools {
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}

class A1{
    String name;
    int age;

    public A1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}