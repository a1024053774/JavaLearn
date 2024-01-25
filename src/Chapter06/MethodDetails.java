package Chapter06;

public class MethodDetails {
    public static void main(String[] args) {
        AA aa = new AA();
        int[] sumAndSub = aa.getSumAndSub(1, 4);
        System.out.println("sumAndSub[0] = " + sumAndSub[0]);
        System.out.println("sumAndSub[1] = " + sumAndSub[1]);

    }
}

class AA{
    public int[] getSumAndSub(int n1,int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }
}
