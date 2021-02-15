package mian.java.com.zpy.learn.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/14 17:15
 */
public class TestMain {
    public static void main(String[] args) {
        LiuDeHua liuDeHua = new LiuDeHua();
        StarProxy starProxy = new StarProxy(liuDeHua);
        Star o = (Star) Proxy.newProxyInstance(liuDeHua.getClass().getClassLoader(), liuDeHua.getClass().getInterfaces(), starProxy);
        System.out.println(o.sing1("忘情水！！"));
        System.out.println(o.sing2());
    }
}
