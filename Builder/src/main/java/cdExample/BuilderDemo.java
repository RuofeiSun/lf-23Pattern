package cdExample;

/**
 * @Author: srf
 * @Date: 2023/11/30 15:13
 * @description:
 */
public class BuilderDemo {

    public static void main(String args[]) {
        CDBuilder cdBuilder = new CDBuilder();
        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2 = cdBuilder.buildSamsungCD();
        cdType2.showItems();
    }

}
