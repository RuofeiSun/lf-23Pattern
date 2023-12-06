/**
 * @Author: srf
 * @Date: 2023/12/6 9:22
 * @description:管理者
 */
public class Manager implements Employee{

    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }

}
