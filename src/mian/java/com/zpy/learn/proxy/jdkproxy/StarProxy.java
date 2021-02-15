package mian.java.com.zpy.learn.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/14 17:11
 */
public class StarProxy implements InvocationHandler {
    private Star target;
    public StarProxy(Star target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入invoke方法！！！");
        Object result = method.invoke(target, args);
        return result;
    }
}
