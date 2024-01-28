package Chapter06;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        //2.编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引l，如果找不到，返回-1

        A02 a02 = new A02();
        char array[] = {'a','c','d','%','p','$'};
        int index_main = a02.find(array);
        if (index_main == -1){
            System.out.println("未找到字符串");
        } else {
            System.out.println("想查找的字符串的位置是:" + index_main);
        }

    }
}
class A02 {

    public int find(char array[]){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入想查找的字符串");
        char input = myScanner.next().charAt(0);
        int index = 0;
        for (int i = 0;i < array.length;i++){
            if (input == array[i]){
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;

    }
}