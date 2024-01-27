package Chapter06;

public class VariableParameters {
    public static void main(String[] args) {
        VariableParameter variableParameter = new VariableParameter();
        int sum = variableParameter.sum(1, 5, 200);
        System.out.println(sum);

    }
}

class VariableParameter {

//    public int sum(int n1,int n2){
//        return n1 + n2;
//    }
//    public int sum(int n1,int n2,int n3){
//        return n1 + n2 + n3;
//    }

    //上面的方法名称相同,功能相同,参数个数不同->可变参数优化

    //1 int...表示接收可变参数,类型是int,即可以接收多个int
    //2 使用可变参数时,可以当作数组来使用 nums可以当作数组
    //3 遍历nums求和
    public int sum(int... nums){
        System.out.println("接收的参数个数=" + nums.length);
        int res = 0;
        for (int i =0;i < nums.length;i++){
            res += nums[i];
        }
        return res;
    }

}
