import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: srf
 * @Date: 2023/11/24 10:40
 * @description:简单工厂模式，使用 GetPlanFactory 来获取具体的计划对象，并根据使用的单位数计算电费。
 */
public class GenerateBill {

    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }

}
