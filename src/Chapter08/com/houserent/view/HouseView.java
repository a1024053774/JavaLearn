package Chapter08.com.houserent.view;

import Chapter08.com.houserent.domain.House;
import Chapter08.com.houserent.service.HouseService;
import Chapter08.com.houserent.utils.Utility;

/**
 * 1. 显示界面
 * 2. 接收用户输入
 * 3. 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);//设置数组的大小为10
    //删除房屋 编写delHouse(),接收输入的id,调用Service的del方法
    public void delHouse(){
        System.out.println("=======================删除房屋信息========================");
        System.out.println("请输入待删除房屋的编号(-1退出):");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("放弃删除房屋信息");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if(houseService.del(delId)){
                System.out.println("删除房屋信息成功");
            } else {
                System.out.println("房屋编号不存在,删除失败");
            }
        } else {
            System.out.println("放弃删除房屋信息");
        }

    }
    //根据id修改房屋信息
    public void update(){
        System.out.println("===================修改房屋信息=================");
        System.out.println("请选择待修改房屋的编号(-1退出)");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("放弃修改房屋信息");
            return;
        }
        //根据输入的updateId,查找对象
        House house = houseService.findById(updateId);
        if (house == null){
            System.out.println("你输入的编号不存在");
            return;
        }
        System.out.print("姓名("+house.getName()+"):");
        String name = Utility.readString(8,"");//如果直接回车,表示不修改该字段,默认""
        if (!"".equals(name)){//修改
            house.setName(name);
        }

        System.out.print("电话("+house.getPhone()+"):");
        String phone = Utility.readString(12,"");//如果直接回车,表示不修改该字段,默认""
        if (!"".equals(phone)){//修改
            house.setPhone(phone);
        }
        System.out.print("地址("+house.getAddress()+"):");
        String address = Utility.readString(18,"");//如果直接回车,表示不修改该字段,默认""
        if (!"".equals(address)){//修改
            house.setAddress(address);
        }
        System.out.print("租金("+house.getRent()+"):");
        int rent = Utility.readInt(-1);//如果直接回车,表示不修改该字段,默认""
        if (rent != -1){//修改
            house.setRent(rent);
        }
        System.out.print("状态("+house.getState()+"):");
        String state = Utility.readString(3,"");//如果直接回车,表示不修改该字段,默认""
        if (!"".equals(state)){//修改
            house.setAddress(state);
        }
        System.out.println("======修改成功======");

    }
    //根据id查找房屋信息
    public void findHouse(){
        System.out.println("====================查找房屋信息=================");
        System.out.println("请输入要查找的id");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if (house != null){
            System.out.println(house);
        } else {
            System.out.println("查找房屋id不存在");
        }
    }
    //x编写addHouse(),接受输入,
    public void addHouse(){
        System.out.println("=======================添加房屋========================");
        System.out.println("姓名:");
        String name = Utility.readString(8);
        System.out.println("电话:");
        String phone = Utility.readString(12);
        System.out.println("地址:");
        String address = Utility.readString(16);
        System.out.println("月租:");
        int rent = Utility.readInt();
        System.out.println("状态:");
        String state = Utility.readString(3);
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("=======================添加房屋成功========================");
        } else {
            System.out.println("=======================添加房屋失败========================");
        }
    }
    //退出确认
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

    //显示房屋列表
    public void listHouses(){
        System.out.println("=======================房屋列表========================");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0;i < houses.length;i++){
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("======================房屋列表显示完毕===================");
    }
    public void mainMenu(){
        do {
            System.out.println("=======================房屋出租系统菜单====================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 信 息");
            System.out.println("\t\t\t6 退            出 ");
            System.out.println("请输入你的选择(1-6):");
            key = Utility.readChar();
            switch (key){
                case '1' :
                    addHouse();
                    break;
                case '2' :
                    findHouse();
                    break;
                case '3' :
                    delHouse();
                    break;
                case '4' :
                    update();
                    break;
                case '5' :
                    listHouses();
                    break;
                case '6' :
                    exit();
                    break;
            }

        }while(loop);
    }
}
