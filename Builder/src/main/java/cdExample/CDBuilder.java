package cdExample;

/**
 * @Author: srf
 * @Date: 2023/11/30 15:12
 * @description:这个类充当建造者，提供了构建特定品牌CD的方法。buildSonyCD和buildSamsungCD方法分别创建含有Sony和Samsung CD的CDType对象。
 */
public class CDBuilder {

    public CDType buildSonyCD() {
        CDType cds = new CDType();
        cds.addItem(new Sony());
        return cds;
    }

    public CDType buildSamsungCD() {
        CDType cds = new CDType();
        cds.addItem(new Samsung());
        return cds;
    }

}
