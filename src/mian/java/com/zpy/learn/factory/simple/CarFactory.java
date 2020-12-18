package mian.java.com.zpy.learn.factory.simple;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2020/12/17 19:51
 */
public class CarFactory {
    public static Car getCar(String type){
        if (type.equals("昂克塞拉")){
            return new Angkesaila();
        }else if (type.equals("阿特兹")){
            return new Atezi();
        }
        return null;
    }
}
