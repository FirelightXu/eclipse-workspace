package jdbc_demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcdemos {

    public static final String URL = "jdbc:mysql://localhost:3306/javademo";
    public static final String USER = "root";
    public static final String PASSWORD = "";

    public static void main(String[] args) throws Exception {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate("create table student(NO char(20),name varchar(20),primary key(NO))");
        //如果有数据，rs.next()返回true
        if (result != -1) {
            System.out.println("创建数据表成功");
        }
    }
}