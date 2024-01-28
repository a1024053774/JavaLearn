package Chapter06;

public class HomeWork1 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double array[] = {1.1,8.8,5.5,7.7,9.9};
        double max = a01.max(array);
        System.out.println("数组array的最大值是" + max);
    }
}

class A01{
    public double max(double array[]){
        double maxm =array[0];
        for (int i = 1;i < array.length;i++){
            if (array[i] > maxm){
                maxm = array[i];
            }
        }
        return maxm;
    }
}
