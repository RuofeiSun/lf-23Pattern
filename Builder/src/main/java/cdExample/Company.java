package cdExample;

/**
 * @Author: srf
 * @Date: 2023/11/30 15:11
 * @description:Company 类继承自 CD 类，增加了关于价格的抽象方法。这个类代表生产CD的不同公司。
 */
public abstract class Company extends CD{

    public abstract int price();

}
