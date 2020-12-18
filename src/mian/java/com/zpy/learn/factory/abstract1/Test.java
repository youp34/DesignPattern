package mian.java.com.zpy.learn.factory.abstract1;

import mian.java.com.zpy.learn.factory.abstract1.factory.HuaweiFactory;
import mian.java.com.zpy.learn.factory.abstract1.factory.ProductFactory;
import mian.java.com.zpy.learn.factory.abstract1.factory.XiaomiFactory;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/17 21:32
 *
 * 抽象工厂模式（工厂的工厂!）
 *
 *
 * 抽象工厂模式就是同种物品 可以让多个不同品牌的工厂进行生产
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("===========================华为===========================");
        ProductFactory huawei = new HuaweiFactory();
        huawei.IphoneProduct().start();
        System.out.println("===========================小米===========================");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.IphoneProduct().start();
    }
}
