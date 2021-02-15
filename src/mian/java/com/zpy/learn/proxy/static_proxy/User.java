package mian.java.com.zpy.learn.proxy.static_proxy;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/3 18:26
 * 房东
 */
public class User implements room{

    @Override
    public void pay(int money) {
        System.out.println("付了"+money);
    }
}
