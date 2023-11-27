/**
 * @Author: srf
 * @Date: 2023/11/27 10:40
 * @description:
 */
public abstract class AbstractFactory {

    public abstract Bank getBank(String bank);

    public abstract Loan getLoan(String loan);

}
