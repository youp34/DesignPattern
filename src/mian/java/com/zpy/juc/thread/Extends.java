package mian.java.com.zpy.juc.thread;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/28 9:34
 */
public class Extends extends Thread {
    @Override
    public void run() {
        System.out.println("线程运行");
    }

    public static void main(String[] args) {
        Extends anExtends = new Extends();
        anExtends.start();
    }
}
