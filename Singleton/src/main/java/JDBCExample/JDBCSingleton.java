package JDBCExample;

import java.sql.*;

/**
 * @Author: srf
 * @Date: 2023/11/27 16:37
 * @description:
 */
public class JDBCSingleton {

    // 静态成员仅持有JDBCSingleton类的一个实例
    private static JDBCSingleton jdbc;

    // 私有构造器防止其他类实例化
    private JDBCSingleton() { }

    // 提供全局访问点
    public static JDBCSingleton getInstance() {
        if (jdbc == null) {
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    // 获取连接以进行插入、查看等操作
    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwanirajput", "root", "ashwani");
        return con;
    }

    // 向数据库中插入记录
    public int insert(String name, String pass) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;

        try {
            c = getConnection();
            ps = c.prepareStatement("insert into userdata(uname, upassword) values(?, ?)");
            ps.setString(1, name);
            ps.setString(2, pass);
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }

    // 从数据库中查看数据
    public void view(String name) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = this.getConnection();
            ps = con.prepareStatement("select * from userdata where uname = ?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("姓名: " + rs.getString(2) + "\t" + "密码: " + rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    // 更新给定用户名的密码
    public int update(String name, String password) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;

        try {
            c = this.getConnection();
            ps = c.prepareStatement("update userdata set upassword = ? where uname = '" + name + "'");
            ps.setString(1, password);
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }

    // 从数据库删除数据
    public int delete(int userid) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;

        try {
            c = getConnection();
            ps = c.prepareStatement("delete from userdata where uid = '" + userid + "'");
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }

}
