package mian.java.com.zpy.learn.proxy.jdkproxy;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/14 17:08
 */
public class LiuDeHua implements Star {
    @Override
    public String sing1(String name) {
        System.out.println("唱"+name);
        return "唱完了1";
    }

    @Override
    public String sing2(){
        System.out.println("唱十七岁~~~");
        return "唱完了";
    }
}
