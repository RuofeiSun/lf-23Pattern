import java.sql.Connection;

/**
 * @Author: srf
 * @Date: 2023/11/30 16:49
 * @description:JDBCConnectionPool 允许应用程序借用和归还数据库连接：
 */
public class Main {

    public static void main(String args[]) {
        // 做一些事情...

        // 创建 ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // 获取一个连接：
        Connection con = pool.checkOut();

        // 使用连接

        // 归还连接：
        pool.checkIn(con);
    }

}
