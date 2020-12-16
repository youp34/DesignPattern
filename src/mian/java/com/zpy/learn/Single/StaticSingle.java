package mian.java.com.zpy.learn.Single;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/16 18:26
 *
 * 静态内部类实现 线程安全的单例模式
 */
public class StaticSingle {
    private StaticSingle(){ };

    private static class Single1{
        private static final StaticSingle instance = new StaticSingle();
    }

    public static StaticSingle getInstance(){
        return Single1.instance;
    }
}
