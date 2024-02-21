package Chapter10.com.interface_;

public class Interface01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();

        Computer computer = new Computer();
        computer.work(phone);//把手机接入计算机
        computer.work(camera);
    }
}
