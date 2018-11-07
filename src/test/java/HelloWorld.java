import org.junit.Assert;
import org.junit.Test;

public class HelloWorld {
    //独立运行，不在需要main函数
    @Test
    public void HelloWorld(){
        System.out.println("Hello World");
        //断言 将运行结果与实际运行结果进行对比
        int s = 1;
        Assert.assertEquals(1,s);
    }
}
