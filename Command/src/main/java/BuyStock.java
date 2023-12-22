/**
 * @Author: srf
 * @Date: 2023/12/22 14:51
 * @description:具体命令类。
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }

}
