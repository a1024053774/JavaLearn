package Chapter06;

public class VariableParameterDetail {
    public static void main(String[] args) {
        TTT ttt = new TTT();

        System.out.println(ttt.f2("张三",24.5,98.3));
        System.out.println(ttt.f2("李四",24.5,98.3,88.8));
        System.out.println(ttt.f2("王五",24.5,98.3,66.6,88.8,99.9));

    }
}

class TTT {
    //有三个方法，分别实现返回姓名和两门课成绩（总分），
    // 返回姓名和三门课成绩（总分），返回姓名和五门课成绩（总分）。
    // 封装成一个可变参数的方法
    public String f2 (String name,double... scores){
        double sum = 0;
        for (int i = 0;i < scores.length;i++){
            sum += scores[i];
        }
        return name + scores.length + "门课的总分是" + sum;
    }
}
