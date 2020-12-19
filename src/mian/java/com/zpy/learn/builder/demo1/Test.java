package mian.java.com.zpy.learn.builder.demo1;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/19 18:33
 */
public class Test {
    public static void main(String[] args) {
        Directer directer = new Directer();
        Product product = directer.buildMethod1(new Worker());
        System.out.println(product.toString());
    }
}
