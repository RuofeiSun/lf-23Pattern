/**
 * @Author: srf
 * @Date: 2023/11/27 10:46
 * @description:
 */
public class FactoryCreator {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }

        return null;
    }

}
