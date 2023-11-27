package JDBCExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * @Author: srf
 * @Date: 2023/11/27 16:43
 * @description:
 */
public class JDBCSingletonDemo {
    static int count = 1;
    static int choice;

    public static void main(String[] args) throws IOException {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("数据库操作");
            System.out.println("---------------------");
            System.out.println("1. 插入");
            System.out.println("2. 查看");
            System.out.println("3. 删除");
            System.out.println("4. 更新");
            System.out.println("5. 退出");

            System.out.print("\n请输入你想在数据库中执行的操作: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    System.out.print("输入要插入数据库的用户名: ");
                    String username = br.readLine();
                    System.out.print("输入要插入数据库的密码: ");
                    String password = br.readLine();

                    try {
                        int i = jdbc.insert(username, password);
                        if (i > 0) {
                            System.out.println("第 " + (count++) + " 条数据已成功插入");
                        } else {
                            System.out.println("数据未插入");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("按回车键继续...");
                    System.in.read();
                    break;
                }
                case 2: {
                    System.out.print("输入要查看的用户名: ");
                    String username = br.readLine();

                    try {
                        jdbc.view(username);
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                    System.out.println("按回车键继续...");
                    System.in.read();
                    break;
                }
                case 3: {
                    System.out.print("输入要删除的用户ID: ");
                    int userid = Integer.parseInt(br.readLine());

                    try {
                        int i = jdbc.delete(userid);
                        if (i > 0) {
                            System.out.println("第 " + (count++) + " 条数据已成功删除");
                        } else {
                            System.out.println("数据未删除");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("按回车键继续...");
                    System.in.read();
                    break;
                }
                case 4: {
                    System.out.print("输入要更新的用户名: ");
                    String username = br.readLine();
                    System.out.print("输入新密码: ");
                    String password = br.readLine();

                    try {
                        int i = jdbc.update(username, password);
                        if (i > 0) {
                            System.out.println("第 " + (count++) + " 条数据已成功更新");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("按回车键继续...");
                    System.in.read();
                    break;
                }
                default:
                    return;
            }
        } while (choice != 5);
    }
}
