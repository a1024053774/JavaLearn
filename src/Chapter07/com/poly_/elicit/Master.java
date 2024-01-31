package Chapter07.com.poly_.elicit;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //主人给小狗喂食
    public void feed(Dog dog,Bone bone){
        System.out.println("主人 " + this.name + " 给 "  + dog.getName()
                           + " 吃" + bone.getName());
    }
    //主人给小猫喂鱼
    public void feed(Cat cat,Fish fish){
        System.out.println("主人 " + this.name + " 给 "  + cat.getName()
                + " 吃" + fish.getName());
    }

    //如果动物很多,食物很多
    //不利于管理和维护
    //重载很多
    //........
}
