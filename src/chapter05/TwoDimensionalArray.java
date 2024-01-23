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
