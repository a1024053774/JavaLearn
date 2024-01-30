package Chapter07;

import java.util.Arrays;

public class packageLearn {
    public static void main(String[] args) {
        int arr[] = {9,-8,8,0,13,-7};
        //使用系统提供的Arrays的sort方法进行排序
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
