package mian.java.com.zpy.learn.factory.abstract1.factory;
//抽象产品工厂

import mian.java.com.zpy.learn.factory.abstract1.common.IPhone;
import mian.java.com.zpy.learn.factory.abstract1.common.IRouter;

public interface ProductFactory {
    //生产手机
    IPhone IphoneProduct();
    // 生产路由器
    IRouter RouterProduct();

}
