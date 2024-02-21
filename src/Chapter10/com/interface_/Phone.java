package Chapter10.com.interface_;

/**
 * Phone 类实现 UsbInterface
 * 1. Phone类需要实现接口规定的方法
 */
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
