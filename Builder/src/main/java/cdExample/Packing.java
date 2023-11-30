package cdExample;

/**
 * @Author: srf
 * @Date: 2023/11/30 15:09
 * @description:定义了产品（CD）的包装和定价的接口。这个接口提供了pack()和price()两个方法，分别用于获取产品的包装信息和价格。
 */
public interface Packing {
    public String pack();
    public int price();
}
