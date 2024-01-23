package chapter05;

import java.util.Scanner;

public class SeqSearch {
    //顺序查找
    public static void main(String[] args) {
        String arr[] = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String findName = myScanner.next();


        int index = -1;//引入此值以判定是否找到
        for (int i =0;i < arr.length;i++){
            if (findName.equals(arr[i])){
                System.out.println("找到了" + findName);
                System.out.println("下标为" + i);
                index = i;
                break;
            }
        }
    if (index == -1){
        System.out.println("没有找到" + findName);
    }
    }
}
