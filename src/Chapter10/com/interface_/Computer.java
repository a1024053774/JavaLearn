package Chapter10.com.interface_;

public class Computer {
    //编写方法,接入接口
    public void work(UsbInterface usbInterface){
        //通过接口调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
