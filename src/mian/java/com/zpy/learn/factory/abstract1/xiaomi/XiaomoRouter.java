package mian.java.com.zpy.learn.factory.abstract1.xiaomi;

import mian.java.com.zpy.learn.factory.abstract1.common.IRouter;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/17 21:43
 */
public class XiaomoRouter  implements IRouter {
    @Override
    public void start() {
        System.out.println("开启小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void useWifi() {
        System.out.println("使用小米路由器");
    }
}
