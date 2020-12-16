package mian.java.com.zpy.learn.Single;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/16 17:54
 *
 * 枚举方式实现单例
 */
public enum  EnumSingle {
    INSTANCE;
    public EnumSingle gerInstance(){
        return INSTANCE;
    }
}
