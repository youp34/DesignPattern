package mian.java.com.zpy.learn.builder.demo1;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/19 18:11
 *
 * 指挥 工人建造的顺序
 *
 * 核心
 */
public class Directer {
    //泛型  按照一定顺序去控制建造工人的执行方法!
    public Product buildMethod1(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
