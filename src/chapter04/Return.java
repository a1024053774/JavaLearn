package chapter04;

public class Return {
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++){
            if(i == 3){
                System.out.println("u" + i);
                //break;//hello world hello world u3 go on..
                //continue;//hello world hello world u3 hello world hello world go on..
                return; //hello world! hello world! u3
            }
            System.out.println("hello world!");
        }
        System.out.println("go on..");
    }
}
