package chapter04;

public class Continue {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            i++;
            if( i ==2 ){
                continue;
            }
            System.out.println("i=" + i);
        }
    }
}

class Continue2 {
    public static void main(String[] args) {
        label1:
        for(int j = 0; j < 4;j++){
            label2:
            for(int i =0;i <10;i++){
                if(i == 2){
//                    continue;
                    //等价
//                    continue label2;
                    continue label1; //输出两次[0,1]
                }
                System.out.println("i=" + i);
                //输出四组[0,1,3,4,5,6,7,8,9,]
            }
        }
    }
}
