import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: srf
 * @Date: 2023/11/24 10:55
 * @description:方法工厂模式
 */
public class GenerateBillPro {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        GetPlanFactoryPro factory = getFactory(planName);
        if (factory == null) {
            System.out.println("Invalid Plan Type");
            return;
        }

        Plan p = factory.getPlan();
        System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }

    private static GetPlanFactoryPro getFactory(String planType) {
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlanFactory();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlanFactory();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlanFactory();
        }
        return null;
    }

}
