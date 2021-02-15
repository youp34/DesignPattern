package mian.java.com.zpy.juc.thread;

import java.util.concurrent.*;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/1/28 9:51
 */
public class HaveReturn implements Callable<Integer> {
    private int n;


    public HaveReturn(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < n; i++) {
            System.out.println(Thread.currentThread().getName() + "走一下");
        }
        return n;
    }
}
class Test{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        HaveReturn haveReturn = new HaveReturn(5);
        HaveReturn haveReturn1 = new HaveReturn(6);
        HaveReturn haveReturn2 = new HaveReturn(7);
        Future<Integer> submit = executorService.submit(haveReturn);
        Future<Integer> submit1 = executorService.submit(haveReturn1);
        Future<Integer> submit2 = executorService.submit(haveReturn2);

        try{
            System.out.println(submit.get());
            System.out.println(submit1.get());
            System.out.println(submit2.get());
        }catch (Exception e){
            System.out.println("---");
        }
        executorService.shutdown();
    }
}
