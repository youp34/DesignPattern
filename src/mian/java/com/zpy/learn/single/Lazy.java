package mian.java.com.zpy.learn.single;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/16 17:11
 *
 * 懒汉模式
 */
public class Lazy {
    private static Lazy instance;

    private String name="zpyccc";


    /**
     * 构造方法私有化！！！！！
     */
    private Lazy(){
        System.out.println(Thread.currentThread().getName());
    }

    public static Lazy getInstance() {
        if (instance == null){
            instance = new Lazy();
            return instance;
        }else {
            return instance;
        }
    }

    public String getName() {
        return name;
    }
}

class Main1{
    public static void main(String[] args) {
        /*System.out.println(Lazy.getInstance().hashCode());
        System.out.println(Lazy.getInstance().hashCode());
        System.out.println(Lazy.getInstance().hashCode());*/
        /**
         * 存在线程安全问题
         */
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Lazy.getInstance();
            }).start();
        }
    }
}
