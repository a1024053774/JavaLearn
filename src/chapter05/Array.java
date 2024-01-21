package chapter05;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        double sum = 0;
        double avg = 0;
        double[] hens = {3,4,1,3.4,2,50};
        //遍历数组得到数组的所有元素的和
        //通过hens[下标]访问数组的元素
        for(int i = 0;i <hens.length;i++){
            System.out.println("第"+ i +"个元素的值=" + hens[i]);
            sum += hens[i];
        }
        avg = sum / hens.length;
        System.out.println(sum);
        System.out.println(avg);

    }
}

class Array02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
//        double[] scores = new double[5];
        double scores[];
        scores = new double[5];

        for( int i = 0;i < scores.length; i++){
            System.out.println("请输入第"+ (i+1) +"个元素的值");
            scores[i] = myScanner.nextDouble();
        }

        for( int i = 0;i < scores.length; i++){
            System.out.println("第"+ (i+1) +"个元素的值是" + scores[i]);
        }
    }
}

class ArrayExercise {
    //创建一个char类型的26个元素的数组，分别放置'A'-Z‘。
    // 使用for循环访问所有元素并打印出来。
    // 提示：char类型数据运算‘A'+1->'B
    public static void main(String[] args) {
        char array[] = new char[26];
        for(int i = 0;i < array.length;i++){
            array[i] = (char) ('A' + i);//'A' + i为int类型
            System.out.print(array[i] + " ");
        }
    }
}


