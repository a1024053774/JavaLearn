package chapter04;

public class While {
    public static void main(String[] args){
        int i = 1;
        while (i <= 10) {
            System.out.println("niu" + i);
            i++;
        }
    }
}
//1~100整除3
class While02 {
    public static void main(String[] args) {
        int i = 1;
        while ( i <=100){
            if (i % 3 == 0){
                System.out.println(i);
            }
            i ++;
        }
    }
}
//40~200 的偶数
class While03 {
    public static void main(String[] args) {
        int i = 40;
        while (i <= 200) {
            if ( i % 2 == 0 ){
                System.out.println(i);
            }
            i++;
        }
    }
}
