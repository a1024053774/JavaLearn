package Chapter08.com.houserent.service;

import Chapter08.com.houserent.domain.House;

/**
 * HouseService.java<=>类类[业务层]
 * //定义House[]，保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作
 */
public class HouseService {
    private House[] houses;
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值

    public HouseService(int size) {
        //new house
        houses = new House[size];
        //初始化一个House对象
        houses[0] = new House(1, "jack", "112", "涉谷区", 2000, "未出租");

    }
    //del方法,删除一个房屋信息
    public boolean del(int delId){
        //应当先找到要删除的房屋信息的下标
        int index = -1;
        for (int i = 0;i < houseNums;i++){
            if (delId == houses[i].getId()){//要删除的房屋id,是数组下标为i的元素
                index = i;
            }
        }
        if (index == -1){//说明delId在数组中不存在
            return false;
        } else {
            for (int i = index;i < houseNums - 1;i++){
                houses[i] = houses[i+1];
            }
            houses[--houseNums] = null;//把当有存在的房屋信息的最后一个 设置null
            return true;
        }
    }

    //list方法,返回houses
    public House[] list() {
        return houses;
    }

    //add方法,添加新对象,返回boolean
    public boolean add(House newHouse){
        //判断是否还可以继续添加
        if (houseNums == houses.length){
            System.out.println("数组已满,不能再添加了...");
            return false;
        }
        houses[houseNums++] = newHouse;
//        houseNums++;
        //设计一个id自增长的机制
//        idCounter++;
        newHouse.setId(++idCounter);
        return true;
    }
    //find,返回House对象,没有则返回空
    public House findById(int findId) {
        //遍历
        for (int i = 0;i < houseNums;i++){
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}
