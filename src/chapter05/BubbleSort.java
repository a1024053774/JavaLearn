package chapter05;

public class BubbleSort {
    public static void main(String[] args) {
//合并,将多轮排序使用外层循环包裹
        int arr[] = {24,69,80,57,13,-1,30,200,-110};
        int temp = 0;
        for (int i = 0; i < arr.length - 1;i++){//外层循环4次
            for (int j = 0; j < arr.length - 1 - i; j++){//4次 -> 3次 -> 2次 -> 1次
                //如果前面的数字>后面的数,就交换
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("==第" + (i + 1) + "轮==");
            for ( int j = 0;j < arr.length; j ++){
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }


/////////////////////////详细///////////////////////////////////////
        //数组[24,69,80,57,13]
        // 第1轮排序：目标把最大数放在最后
        // 第1次比较[24，69，80，57，13]
        // 第2次比较[24，69，80，57，13]
        // 第3次比较[24,69，57，80，13]
        // 第4次比较[24,69,57，13,80]

//        for (int j = 0; j < 4; j++){
//            //如果前面的数字>后面的数,就交换
//            if(arr[j] > arr[j + 1]){
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//        System.out.println("==第一轮==");
//    for ( int j = 0;j < arr.length; j ++){
//        System.out.print(arr[j] + "\t");
//    }
//        System.out.println();
//    //第2轮排序：目标把第二大数放在倒数第二位置
//        // 第1次比较[24,69,57，13，80]
//        // 第2次比较[24，57，69，13，80]
//        // 第3次比较[24,57，13,69,80]
//        for (int j = 0; j < 3; j++){
//            //如果前面的数字>后面的数,就交换
//            if(arr[j] > arr[j + 1]){
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//        System.out.println("==第2轮==");
//        for ( int j = 0;j < arr.length; j ++){
//            System.out.print(arr[j] + "\t");
//        }
//        System.out.println();
//        //第3轮排序：目标把第3大数放在倒数第3位置
//        // 第1次比较[24,57，13,69,80]
//        // 第2次比较[24,13,57,69,80】
//        for (int j = 0; j < 2; j++){
//            //如果前面的数字>后面的数,就交换
//            if(arr[j] > arr[j + 1]){
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//        System.out.println("==第3轮==");
//        for ( int j = 0;j < arr.length; j ++){
//            System.out.print(arr[j] + "\t");
//        }
//        System.out.println();
//        //第4轮排序：目标把第4大数放在倒数第4位置
//        // 第1次比较[13，24,57,69,80]
//        for (int j = 0; j < 1; j++){
//            //如果前面的数字>后面的数,就交换
//            if(arr[j] > arr[j + 1]){
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//        System.out.println("==第4轮==");
//        for ( int j = 0;j < arr.length; j ++){
//            System.out.print(arr[j] + "\t");
//        }
    }
}
