package mian.java.com.zpy.learn.factory.abstract1.huawei;

import mian.java.com.zpy.learn.factory.abstract1.common.IRouter;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/17 21:41
 */
public class HuaweiRouter implements IRouter {
    @Override
    public void start() {
        System.out.println("开启华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void useWifi() {
        System.out.println("使用华为路由器");
    }
}
