/**
 * @Author: srf
 * @Date: 2023/12/22 14:51
 * @description:
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("股票 [ 名称: "+name+", 数量: " + quantity +" ] 购买了");
    }
    public void sell(){
        System.out.println("股票 [ 名称: "+name+", 数量: " + quantity +" ] 卖出了");
    }

}
