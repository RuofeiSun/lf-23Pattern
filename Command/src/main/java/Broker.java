import java.util.ArrayList;
import java.util.List;

/**
 * @Author: srf
 * @Date: 2023/12/22 14:52
 * @description:命令调用者类
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
