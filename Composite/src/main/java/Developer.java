/**
 * @Author: srf
 * @Date: 2023/12/6 9:22
 * @description:开发者
 */
public class Developer implements Employee{
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        // 分配员工 ID、姓名和职位
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}
