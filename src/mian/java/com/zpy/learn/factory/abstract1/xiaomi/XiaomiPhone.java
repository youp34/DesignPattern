package mian.java.com.zpy.learn.factory.abstract1.xiaomi;

import mian.java.com.zpy.learn.factory.abstract1.common.IPhone;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/17 21:42
 */
public class XiaomiPhone implements IPhone {
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void usePhone() {
        System.out.println("使用小米手机");
    }
}
