package mian.java.com.zpy.learn.factory.method;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/17 21:13
 *
 * 工厂方法模式
 */
public class Test {
    public static void main(String[] args) {
        new AppleFruitFactory().createFr().eat();
        new BananaFactory().createFr().eat();
    }
}
