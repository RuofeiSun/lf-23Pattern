import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: srf
 * @Date: 2023/11/27 10:48
 * @description:
 */
public class AbstractFactoryPatternExample {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("输入你想贷款银行的名称: ");
        String bankName = br.readLine();

        System.out.print("\n");
        System.out.print("输入你想贷款的类型: ");

        String loanName = br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.print("\n");
        System.out.print("输入利率 " + b.getBankName() + ": ");

        double rate = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("输入贷款金额: ");

        double loanAmount = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("输入贷款年限: ");
        int years = Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("你正在从银行贷款 " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);
    }

}
