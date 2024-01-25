package Chapter06;

public class MethodExercise {
    public static void main(String[] args) {

        A a = new A();
        if(a.isOdd(8)){
            System.out.println("是奇数");
        } else{
            System.out.println("是偶数");
        }

        a.print(10,20,'?');



    }
}

class A{
    public boolean isOdd(int n){
//        if (n % 2 != 0){
//            System.out.println(n + "是奇数");
//            return true;
//        } else {
//            System.out.println(n + "是偶数");
//            return false;
//        }

        return n % 2 != 0;
    }
    ////根据行、列、字符打印对应行数和列数的字符，
    // 比如：行：4，列：4，字符#，则打印相应的效果
    /*
        ####
        ####
        ####
        ####
     */
    //1.方法的返回类型
    //2.方法的名字 print
    //3. 方法的形参(int row,int column,char c)
    //4.方法体,循环
    public void print(int row,int column,char c){
        for (int i = 0;i < row;i++){
            for(int j = 0;j < column;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
