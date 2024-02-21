package Chapter10.com.abstract_;

public class TestTemplateAA extends Template{
    //实现了父类的抽象job方法
    @Override
    public void job(){
        //得到开始的时间
        long num = 0;
        for (long i = 1; i <= 1000000; i++) {
            num += i;
        }
    }
}
