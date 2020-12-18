package mian.java.com.zpy.learn.single;

import java.lang.reflect.Constructor;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/16 17:19
 *
 * 单例模式 线程安全(Synchronized双重检验锁实现)
 *
 *
 * 不安全！  反射可以获取对象！！！！！！
 */
public class SingleThread {
    //添加 volatile 禁止指令重排序！！！
    private volatile static SingleThread instance;

    private SingleThread(){
        System.out.println(Thread.currentThread().getName());
    }

    /**
     * 加锁双重校验
     * @return
     */
    public static SingleThread getInstance() {
        // 避免影响程序效率
        if (instance == null){
            synchronized (SingleThread.class){
                if (instance == null){
                    // 不是原子性操作可能引起 指令重排序的问题
                    /**
                     * 正常顺序
                     *
                     * 1.堆中创建一段内存空间
                     * 2.执行构造方法实例化对象
                     * 3.对象引用指向这个空间
                     */
                    instance = new SingleThread();
                }
            }
        }
        return instance;
    }
}

class Main2{
    public static void main(String[] args) throws Exception {
        /*for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingleThread.getInstance();
            }).start();
        }*/

        // 反射 破坏
        Constructor<SingleThread> declaredConstructor = SingleThread.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        SingleThread instance2 = declaredConstructor.newInstance();

        System.out.println(instance2);
        System.out.println(SingleThread.getInstance());
    }
}
