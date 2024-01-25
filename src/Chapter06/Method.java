package Chapter06;

public class Method {
    public static void main(String[] args) {
        Person p1 = new Person();//创建对象
        p1.speak();//调用方法
        p1.cal01();
        p1.cal02(5);//调用cal02方法，传入n=5

        //把方法getSum返回的值,赋给变量returnRes
       int returnRes =  p1.getSum(40,20);//调用getSum方法，传入num1=10,num2=20
        System.out.println("getSum方法返回的值=" + returnRes);

        double area = p1.CircleArea(3.8);
        System.out.println("圆的面积是：" + area);
    }
}
class Person{
    String name;
    int age;

    //public表示方法是公开
    //void 表示没有返回值
    //speak是方法名  ()里面是形参列表
    //{}里面是方法体,写执行的代码

    public void speak(){
        System.out.println("我是一个好人");
    }

    public void cal01(){
        int res = 0;
        for (int i = 1;i <= 1000; i++){
            res += i;
        }
        System.out.println("1+2+3+...+1000 = " + res);
    }

    //添加cal02成员方法，可以接收一个数n，计算从1+。。+n的结果
    public void cal02(int n){//表示当前有一个形参n,可以接收用户输入
        int res = 0;
        for (int i = 1;i <= n; i++){
            res += i;
        }
        System.out.println("计算结果是 = " + res);
    }

    //添加getSum成员方法，可以计算两数的和
    //int表示方法执行后,返回一个int值
    //(int num1, int num2)形参列表,可以接收两个int类型的数据
    //return res表示把res的值返回给调用者
    public int getSum(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

    public double CircleArea(double r){
        double area = 3.14 * r * r;
        return area;
    }


}