package mian.java.com.zpy.learn.factory.simple;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/17 17:46
 *
 * 简单(静态)工厂模式
 * 实例化对象不使用new，创建对象统一管理。
 *
 */
public class Test {
    public static void main(String[] args) {
        CarFactory.getCar("昂克塞拉").getCarName();
    }
}
