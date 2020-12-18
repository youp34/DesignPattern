package mian.java.com.zpy.learn.factory.abstract1.huawei;

import mian.java.com.zpy.learn.factory.abstract1.common.IPhone;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/17 21:39
 */
public class HuaweiPhone implements IPhone {
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void usePhone() {
        System.out.println("使用华为手机");
    }
}
