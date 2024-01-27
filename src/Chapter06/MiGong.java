package Chapter06;

public class MiGong {
    public static void main(String[] args) {

        //思路
        //1.先创建迷宫,用二维数组 int[][] map = new int[8][7]
        //2.先规定map数组的元素值:0表示可以走 1表示障碍物

        int[][] map = new int[8][7];

        //3.将最上面和最下面两行全设置为1
        System.out.println("===============当前地图情况=========");
        for (int i = 0;i < map.length;i++){
            for (int j = 0;j < map[i].length;j++){
                map[0][j] = 1;
                map[7][j] = 1;
                map[i][0] = 1;
                map[i][6] = 1;
                map[3][1] = 1;
                map[3][2] = 1;
                map[2][2] = 1;
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        //使用findWay找路
        Tt tt = new Tt();
        tt.findWay(map,1,1);

        System.out.println("==============findWay1找路的情况如下============");
        for (int i = 0;i < map.length;i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

//        tt.findWay2(map,1,1);
//
//        System.out.println("==============findWay2找路的情况如下============");
//        for (int i = 0;i < map.length;i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}

class Tt {

    //1 使用递归回溯思想来解决
    //2 找出迷宫的路径,找到返回true,否则返回false
    //3 map就是二维数组,表示迷宫
    //4 i,j代表老鼠的位置,出生位置为(1,1)
    //5 因为是递归的找路,所以先规定map数组的各个值的含义
    //  0表示没有障碍物,1 表示障碍物,2表示可以走,3表示走过,但是走不通
    //6 当map[6][5] = 2时,就说明到达终点,否则就继续找
    //7 先确定老鼠找路策略 下->右->上->左
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {//说明已经找到
            return true;
        } else {
            if (map[i][j] == 0) {//没有障碍物,还没走过
                //...假定可以走通
                map[i][j] = 2;
                //使用找路策略,来确定该位置是否真的可以走通
                if (findWay(map, i + 1, j)) { //下
                    return true;
                } else if (findWay(map, i, j + 1)) {//右
                    return true;
                } else if (findWay(map, i - 1, j)) {//上
                    return true;
                } else if (findWay(map, i, j - 1)) {//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {// 1代表障碍物 3曾经走过,走不通
                return false;
            }
        }
    }

    public boolean findWay2(int[][] map, int i, int j) {//修改找路策略
        //上  右  下   左
        if (map[6][5] == 2) {//说明已经找到
            return true;
        } else {
            if (map[i][j] == 0) {//没有障碍物,还没走过
                //...假定可以走通
                map[i][j] = 2;
                //使用找路策略,来确定该位置是否真的可以走通
                if (findWay2(map, i - 1, j)) { //上
                    return true;
                } else if (findWay2(map, i, j + 1)) {//右
                    return true;
                } else if (findWay2(map, i + 1, j)) {//下
                    return true;
                } else if (findWay2(map, i, j - 1)) {//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {// 1代表障碍物 3曾经走过,走不通
                return false;
            }
        }
    }
}
