package mian.java.com.zpy.learn.single;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/16 15:22
 *
 * 构造方法私有化
 * 饿汉式 比较浪费资源
 */
public class Hungry {
    private String name = "zpyccc";
    /**
     * 避免实例化该对象
     */
    private Hungry(){}
    private static Hungry instanse = new Hungry();
    public static Hungry getInstanse(){
        return instanse;
    }

    public String getName() {
        return name;
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println(Hungry.getInstanse().getName());
    }
}
