package chapter05;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0},
                        {0, 2, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0}};
        for (int i = 0; i < arr.length; i++) {
            //arr[i].length 得到每一个小{}里面的数组的长度
            //即得到每一个一维数组的长度
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class TwoDimensionalArray02 {
    public static void main(String[] args) {
//        int array[][] = new int[2][3];
        int array[][];
        array = new int[2][3];
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}

class TwoDimensionalArray03 {
    public static void main(String[] args) {
        //
        //i=0 : 1
        //i=1 : 2 2
        //i=2 : 3 3 3
        //
        int arr[][] = new int[10][];//创建二维数组的一维数组的个数
        for ( int i = 0; i < arr.length;i++){
            arr[i] = new int[i + 1];//开辟一维数组的空间
            //遍历一维数组,并给一维数组的每个元素赋值
            for ( int j = 0; j < arr[i].length;j++){
                arr[i][j] = i + 1;
            }
        }

        for (int i = 0;i < arr.length;i++){
            for (int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
