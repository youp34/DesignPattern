package mian.java.com.zpy.learn.factory.method;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/17 21:11
 */
public class AppleFruitFactory implements FruitFactory {
    @Override
    public Fruit createFr() {
        return new Apple();
    }
}
