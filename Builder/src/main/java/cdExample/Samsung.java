package cdExample;

/**
 * @Author: srf
 * @Date: 2023/11/30 15:12
 * @description:这两个类提供了Sony和Samsung公司生产的CD的具体实现。它们覆盖了价格和包装的方法，为Sony CD和Samsung CD分别提供了具体的价格和包装信息。
 */
public class Samsung extends Company {

    @Override
    public int price() {
        return 15;
    }

    @Override
    public String pack() {
        return "Samsung CD";
    }

}
