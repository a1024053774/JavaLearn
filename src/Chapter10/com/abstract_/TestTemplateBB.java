package Chapter10.com.abstract_;

public class TestTemplateBB extends Template{
    @Override
    public void job(){
        //得到开始的时间
        long num = 0;
        for (long i = 1; i <= 8000000; i++) {
            num *= i;
        }
    }
}
