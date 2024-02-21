package Chapter10.com.abstract_;

/**
 * 抽象模板模式
 */
public class TestTemplate {
    public static void main(String[] args) {
        TestTemplateAA aa = new TestTemplateAA();
        aa.calculateTime();
        TestTemplateBB bb = new TestTemplateBB();
        bb.calculateTime();
    }
}


