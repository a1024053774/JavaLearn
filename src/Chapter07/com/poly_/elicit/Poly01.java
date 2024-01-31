package Chapter07.com.poly_.elicit;

public class Poly01 {
    public static void main(String[] args) {
        Master matin = new Master("Matin");
        Dog daHuang = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        Cat tom = new Cat("Tom");
        Fish fish = new Fish("鲫鱼");

        matin.feed(daHuang,bone);
        matin.feed(tom,fish);
    }
}
