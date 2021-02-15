package mian.java.com.zpy.learn.proxy.static_proxy;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/8 11:17
 * 模拟 房东 中介 租户 逻辑实现代理
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        ProxyUser proxyUser = new ProxyUser(user);
        proxyUser.pay(100);
    }
}
