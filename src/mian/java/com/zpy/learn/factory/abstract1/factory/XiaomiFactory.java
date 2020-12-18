package mian.java.com.zpy.learn.factory.abstract1.factory;

import mian.java.com.zpy.learn.factory.abstract1.common.IPhone;
import mian.java.com.zpy.learn.factory.abstract1.common.IRouter;
import mian.java.com.zpy.learn.factory.abstract1.huawei.HuaweiPhone;
import mian.java.com.zpy.learn.factory.abstract1.huawei.HuaweiRouter;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/18 17:24
 */
public class XiaomiFactory implements ProductFactory {
    @Override
    public IPhone IphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouter RouterProduct() {
        return new HuaweiRouter();
    }
}
