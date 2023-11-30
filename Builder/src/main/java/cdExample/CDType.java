package cdExample;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: srf
 * @Date: 2023/11/30 15:12
 * @description:这个类管理一系列的CD产品。它使用一个列表来存储Packing类型的对象，并提供了添加CD和显示CD信息的方法。
 */
public class CDType {

    private List<Packing> items = new ArrayList<Packing>();

    public void addItem(Packing packs) {
        items.add(packs);
    }

    public void showItems() {
        for (Packing packing : items) {
            System.out.print("CD name : " + packing.pack());
            System.out.println(", Price : " + packing.price());
        }
    }

}
