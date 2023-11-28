/**
 * @Author: srf
 * @Date: 2023/11/28 15:19
 * @description:
 */
public class EmployeeRecord implements Prototype {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord() {
        System.out.println("   Oracle公司的员工记录");
        System.out.println("---------------------------------------------");
        System.out.println("员工ID" + "\t" + "姓名" + "\t" + "职位" + "\t" + "薪水" + "\t\t" + "地址");
    }

    // 带参数的构造函数，用于创建员工记录
    public EmployeeRecord(int id, String name, String designation, double salary, String address) {

        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    // 显示员工记录
    public void showRecord() {
        System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
    }

    // 实现 Prototype 接口的 getClone 方法
    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }

}
