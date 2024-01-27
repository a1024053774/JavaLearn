package Chapter06;

public class HanoiTower {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.move(5,'A','B','C');


    }
}
class Hanoi{
    //方法
    //num 表示盘数 ,a,b,c表示三个柱子
    public void move(int num,char a,char b,char c){
        //如果只有一个盘 num = 1
        if (num == 1) {
            System.out.println("第1个盘从" + a + "->" + c);
        } else {
            //如果有多个盘,可以看成两个部分,最下面的和上面的所有盘
            //1 先移动上面所有的盘到b,借助c
            move(num - 1,a,c,b);
            //2 把最下面的盘a->c
            System.out.println("第" + num + "个盘从" + a + "->" + c);
            //3 再把b塔的所有盘移动到c,借助a
            move(num - 1,b,a,c);
        }
    }
}
