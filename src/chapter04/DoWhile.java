package chapter04;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("niu" + i);
            i++;
        }while(i <= 100);
    }
}

class DoWhile02{
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do{
            sum += i;
            i++;
        }while(i <= 100);
        System.out.println(sum);
    }
}

class DoWhile03{
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        do {
            if ( i % 5 == 0 && i % 3 != 0)
            {
                count++;

            }
            i++;
        }while( i <= 200);
        System.out.println("1~200能被5整除但不能被3整除的个数为"
                + count);
    }
}


