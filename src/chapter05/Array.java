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

class ArrayExercise02 {
    //请求出一个数组int[]的最大值{4，-1，9，10，23}，并得到对应的下标
    public static void main(String[] args) {
        int array[] = {4, -1, 9, 10, 23, 101, -23, 56};
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0;i < array.length;i++){
            if(array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}

class ArrayAssign {
    public static void main(String[] args) {
        //基本数据类型赋值,赋值方式为值拷贝
        //n2的变化不会影响到n1的值
        int n1 = 10;
        int n2 = n1;
        n2 = 80;
        System.out.println(n1);
        System.out.println(n2);

        //数组在默认情况下是引用传递,赋的值是地址，赋值方式为引用赋值
        //arr2变化会影响到arr1
        int arr1[] = {1,2,3};
        int arr2[] = arr1;
        arr2[0] = 10;
        System.out.println("=======arr1的值=========");
        for(int i = 0;i < arr1.length;i++){
            System.out.println(arr1[i]);
            // 10,2,3
        }
    }
}

class ArrayCopy {
    public static void main(String[] args) {
        //将int[]arr1={10,20,30}；拷贝到arr2数组
        // 要求数据空间是独立的
        int arr3[] = {10,20,30};
        int arr4[] = new int[arr3.length];

        for (int i = 0; i < arr3.length; i++){
            arr4[i] = arr3[i];
        }
        //修改arr4
        arr4[0] = 100;
        //arr3的值
        for (int i =0;i < arr3.length;i++){
            System.out.print(arr3[i] + " ");
        }
        System.out.print('\n');
        //arr4的值
        for (int i =0;i < arr4.length;i++){
            System.out.print(arr4[i] + " ");
        }

    }
}

class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66};
        for ( int i = 0; i < arr.length / 2;i++){
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

class ArrayReverse02{
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66};
        int arr2[] = new int[arr.length];

        for(int i = 0;i < arr.length;i++){
            arr2[i] = arr[arr.length -1 - i];
        }
        arr = arr2;
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

class ArrayAdd {
    public static void main(String[] args) {
    //要求：实现动态的给数组添加元素效果，实现对数组扩容。
        // 1.原始数组使用静态分配int[]arr={1,2,3}
        // 2.增加的元素4，直接放在数组的最后arr={1,2,3,4}
        // 3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
    // 思路
        // 1定义初始数组 int[] arr={1,2,3}//下标0-2
        // 2定义-个新的数组 int[] arrNew = new int[arr。length+1];
        // 3遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
        // 4将 4 赋给 arrNew[arrNew.length － 1]=4;把4赋给arrNew最后一个元素
        // 5让 arr 指向 arrNew ； arr = arrNew；那么 原来arr数组就被销毁

        int arr[] = {1,2,3};
        int arrNew[] = new int[arr.length + 1];
        for (int i =0; i < arr.length;i++){
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew;
        System.out.println("扩容后arr为");
        for (int i =0; i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }

    }
}

class ArrayAddFinal {
    public static void main(String[] args) {
        //要求：实现动态的给数组添加元素效果，实现对数组扩容。
        // 1.原始数组使用静态分配int[]arr={1,2,3}
        // 2.增加的元素4，直接放在数组的最后arr={1,2,3,4}
        // 3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
        // 思路
        // 1定义初始数组 int[] arr={1,2,3}//下标0-2
        // 2定义-个新的数组 int[] arrNew = new int[arr。length+1];
        // 3遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
        // 4将 4 赋给 arrNew[arrNew.length － 1]=4;把4赋给arrNew最后一个元素
        // 5让 arr 指向 arrNew ； arr = arrNew；那么 原来arr数组就被销毁
        //6创建一个Scanner接收用户输入
        //7 不确定什么时候退出,使用do-while break控制
        Scanner myScanner = new Scanner(System.in);
        int arr[] = {1, 2, 3};
        do {
            int arrNew[] = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }

            System.out.println("请输入你要添加的元素");
            int addNum = myScanner.nextInt();

            arrNew[arrNew.length - 1] = addNum;
            arr = arrNew;

            System.out.println("扩容后arr为");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }

            System.out.println("是否继续添加 y/n");
            char key = myScanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        }while (true);

    }
}