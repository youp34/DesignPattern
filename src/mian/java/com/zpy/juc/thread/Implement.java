package mian.java.com.zpy.juc.thread;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/28 9:43
 */
public class Implement implements Runnable{
    @Override
    public void run() {
        System.out.println("线程运行" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Implement implement = new Implement();
        Thread thread = new Thread(implement);
        System.out.println(Thread.currentThread().getName());
        thread.start();

        // 匿名内部类方法

    }
}
