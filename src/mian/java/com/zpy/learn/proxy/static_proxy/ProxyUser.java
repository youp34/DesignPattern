package mian.java.com.zpy.learn.proxy.static_proxy;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/3 18:28
 */
public class ProxyUser implements room {
    private room target = null;
    public ProxyUser(room target){
        this.target = target;
    }
    @Override
    public void pay(int money) {
        System.out.println("中间收费十元");
        target.pay(money-10);
    }
}
