package chapter05;

public class Chapter05_HomeWork {
    //4.已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，
    // 比如：[10，12，45，90]，添加23后，数组为[10，12，23，45，90]
    //先扩容,再冒泡
    public static void main(String[] args) {
        int array[] = {10,12,45,90};
        int arrayNew[] = new int[array.length + 1];
        for(int i = 0;i < array.length;i++){
         arrayNew[i] = array[i];
        }
        arrayNew[arrayNew.length - 1] = 23;
        array = arrayNew;

        int temp = 0;
        for (int i = 0;i < array.length - 1;i++){
            for (int j = 0;j < array.length - 1 - i;j++){
                if (array[j] > array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;}
            }
        }
        for (int i = 0;i < array.length;i++){
        System.out.print(array[i] + " ");}
    }
}

class Chapter05_HomeWork_Way2{
    //4.已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，
    // 比如：[10，12，45，90]，添加23后，数组为[10，12，23，45，90]
    //先确定应该插入到哪个索引
    //然后扩容
    public static void main(String[] args) {
    int arr[] = {10,12,45,90};
    int insertNum = 23;
    int index = -1;
    //遍历arr数组,发现insertNum<=arr[i],说明i就是插入的位置
        //使用index保留index = i;
        //如果遍历完之后没有发现insertNum<=arr[i],
        // 说明index = arr.length
        for (int i = 0;i < arr.length;i++){
            if (insertNum <= arr[i]){
                index = i;
                break;
            }
            //判断index看是否找到位置
            if (index == -1){
                index = arr.length;
            }
        }
        System.out.println("index=" + index);

        int arrNew[] = new int[arr.length + 1];
        //将arr的元素拷贝到arrNew,并跳过index的位置
        for(int i = 0,j = 0;i < arrNew.length; i++){
            if(i != index){
                arrNew[i] = arr[j];
                j++;
            } else {
                arrNew[i] = insertNum;
            }
        }
        arr = arrNew;
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}


class Chapter05_HomeWork05{
    //随机生成10个整数（1_100的范围）保存到数组，
    // 并倒序打印以及求平均值、求最大值和最大值的下标、
    // 并查找里面是否有8
    public static void main(String[] args) {
        int array[] = new int[10];
        for(int i = 0;i < array.length;i++){
            array[i] = (int)(Math.random() * 100) + 1;
        }
        double sum = 0;
        int max = array[0];
        int maxIndex = 0;
        //逆序打印
        for(int i = array.length - 1;i >= 0;i--){
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.println((sum / array.length) + "平均值");

        for(int i = 0;i < array.length;i++){
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("max是" + max + "下标是" + maxIndex);

        int findNum = 8;
        int index = -1;
        for(int i = 0; i < array.length;i++){
            if(findNum == array[i]){
                System.out.println("找到数" + findNum + "下标是" + i);
                index = i;
                break;
            }
        }
        if (index== -1){
            System.out.println("未找到" + findNum);
        }
    }
}

class BubbleSort_HomeWork{
    public static void main(String[] args) {
        int arr[] = {24,69,80,57,13,-1,30,200,-110};
        int temp = 0;
        for (int i = 0; i < arr.length - 1;i++){
            for( int j = 0; j < arr.length - 1 -i;j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.print("第" + (i+1) +"轮冒泡排序");
            for (int j = 0; j < arr.length;j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
