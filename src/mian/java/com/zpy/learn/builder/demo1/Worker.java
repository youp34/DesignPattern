package mian.java.com.zpy.learn.builder.demo1;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/19 18:11
 *
 *
 * 工人 具体的建造者
 */
public class Worker extends Builder {

    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("建造A");
        System.out.println("1");
    }

    @Override
    void buildB() {
        product.setBuildB("建造B");
        System.out.println("2");
    }

    @Override
    void buildC() {
        product.setBuildC("建造C");
        System.out.println("3");
    }

    @Override
    void buildD() {
        product.setBuildD("建造D");
        System.out.println("4");
    }

    @Override
    Product getProduct() {
        return this.product;
    }
}
