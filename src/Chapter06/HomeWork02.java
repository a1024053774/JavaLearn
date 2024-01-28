package Chapter06;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {

        A02 a02 = new A02();
        char array[] = {'a','c','d','%','p','$'};
        int index_main = a02.find(array);
        System.out.println("想查找的字符串的位置是:" + index_main);

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