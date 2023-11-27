/**
 * @Author: srf
 * @Date: 2023/11/27 10:43
 * @description:贷款工厂
 */
public class LoanFactory extends AbstractFactory{

    @Override
    public Bank getBank(String bank){
        return null;
    }

    @Override
    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }

}
