/**
 * @Author: srf
 * @Date: 2023/12/22 14:52
 * @description:
 */
public class SellStock implements Order{

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }

}
