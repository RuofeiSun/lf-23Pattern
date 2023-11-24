/**
 * @Author: srf
 * @Date: 2023/11/24 10:37
 * @description:
 */
public abstract class Plan {

    protected double rate;
    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }

}
