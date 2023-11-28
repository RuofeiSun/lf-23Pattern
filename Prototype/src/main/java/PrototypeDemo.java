import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: srf
 * @Date: 2023/11/28 15:19
 * @description:
 */
public class PrototypeDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("输入员工ID: ");
        int eid = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("输入员工姓名: ");
        String ename = br.readLine();
        System.out.print("\n");

        System.out.print("输入员工职位: ");
        String edesignation = br.readLine();
        System.out.print("\n");

        System.out.print("输入员工地址: ");
        String eaddress = br.readLine();
        System.out.print("\n");

        System.out.print("输入员工薪水: ");
        double esalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        // 创建原始员工记录并显示
        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);
        e1.showRecord();
        System.out.println("\n");

        // 克隆员工记录并显示
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }

}
