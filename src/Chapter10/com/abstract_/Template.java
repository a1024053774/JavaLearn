package Chapter10.com.abstract_;

abstract public class Template {//抽象类--模板
    abstract public void job();
    public void calculateTime(){
        long startTime = System.currentTimeMillis();
        job();
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间是" + (endTime - startTime));
    }
}
