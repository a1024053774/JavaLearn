package Chapter06;

public class HomeWork09 {
    public static void main(String[] args) {
        //定义Music类，里面有音乐名name、音乐时长times属性，并有播放play功能和返回本身属性信息的功能
        // 方法getlnfo
        Music music = new Music();
        music.playMusic();
        music.name = "Enchanted";
        music.times = 6;
        music.getInfo();
    }
}
class Music{
    String name;
    int times;
    public void playMusic(){
        System.out.println("播放了音乐");
    }
    public void getInfo(){
        System.out.println("音乐名字是" + this.name + "音乐时常是" + this.times);
    }
}
