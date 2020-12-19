package mian.java.com.zpy.learn.builder.demo1;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/19 18:10
 *
 * 抽象 建造者 (模板)
 */
public abstract class Builder {

    abstract void buildA();
    abstract void buildB();
    abstract void buildC();
    abstract void buildD();

    abstract Product getProduct();

}
