package chapter05;

public class YangHuiTriAngel {
    //第一行有1个元素,第n行有n个
    //每一行的每一个元素和最后一个元素都是1
    //从第三行开始，对于非第一个元素和最后一个元素的元素的值
    // arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
    public static void main(String[] args) {
        int array[][] = new int[20][];
        for (int i = 0;i < array.length;i++){
            array[i] = new int[i + 1];
            //给每个一维数组赋值
            for ( int j = 0;j < array[i].length;j++){
                if ( j == 0 ||j == array[i].length - 1){
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i-1][j] + array[i-1][j-1];
                }
//                System.out.print(array[i][j] + " ");
            }
//            System.out.println();

        }
    for(int i = 0;i < array.length;i++){
        for (int j = 0; j < array[i].length;j++){
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
    }
}
