package Chapter06;

public class HomeWork1 {
    //编写类A01，定义方法max，实实现求某个double数组的最大值，并返回
    public static void main(String[] args) {
        A01 a01 = new A01();
        double array[] = {1.1,8.8,5.5,7.7,9.9};
        Double max = a01.max(array);
        if (max != null){
            System.out.println("数组array的最大值是" + max);
        } else {
            System.out.println("数组array输入错误,不能为null或者{}");
        }

    }
}

class A01{
    public Double max(double array[]){//Double为对象,可以赋空值
        //保证数组不为空
        if (array != null && array.length > 0){//先判断array是否为空再判断length>0,避免了输入数组为null时的错误
            double maxm =array[0];
            for (int i = 1;i < array.length;i++){
                if (array[i] > maxm){
                    maxm = array[i];
                }
            }
            return maxm;
        } else {
            return null;
        }
    }
}
