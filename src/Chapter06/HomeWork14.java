package Chapter06;

public class HomeWork14 {
    //有个人 Tom设 计他的成员变量.成员方法，可以电脑猜拳。
    // 电脑每次都会随机生成0，1，2
    // 0表示石头1表示剪刀2表示布
    // 并要可以显示Tom的输赢次数（清单）
    public static void main(String[] args) {
        Tom tom = new Tom();
        int input[] = {0,1,2,0,1,2,0,1,2,0,1,2};
        tom.guess(input);
        tom.show();
    }
}
class Tom{
    int win;
    int lose;
    int draw;
    public void guess(int input[]){
        int random = (int)(Math.random() * 3);
        for (int i = 0;i < input.length;i++) {
            if (input[i] == random) {
                System.out.println("平局");
                draw++;
            } else if (input[i] == 0 && random == 1) {
                System.out.println("你赢了");
                win++;
            } else if (input[i] == 0 && random == 2) {
                System.out.println("你输了");
                lose++;
            } else if (input[i] == 1 && random == 0) {
                System.out.println("你输了");
                lose++;
            } else if (input[i] == 1 && random == 2) {
                System.out.println("你赢了");
                win++;
            } else if (input[i] == 2 && random == 0) {
                System.out.println("你赢了");
                win++;
            } else if (input[i] == 2 && random == 1) {
                System.out.println("你输了");
                lose++;
            }
        }
    }
    public void show(){
        System.out.println("赢了" + win + "次");
        System.out.println("输了" + lose + "次");
        System.out.println("平局" + draw + "次");
    }
}


