package jdbc_demos1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemos {

    public static final String URL = "jdbc:mysql://localhost:3306/imooc";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    
    private static Connection conn=null;
    
    static {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    //对外提供一个方法，来获取这个链接
    public static Connection getConnection() {
    	return conn;
    }

    public static void main(String[] args) throws Exception {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.操作数据库，实现增删改查
        
        String sql = "insert into imooc_goddess(user_name) values(?) ";
        
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setString(1, "XIAOLI");
        ptmt.executeUpdate();
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT user_name,age From imooc_goddess");
//        //如果有数据，rs.next()返回true
//        while(rs.next()) {
//        	System.out.println(rs.getString("user_name")+" 年龄："+rs.getInt("age"));
//        }
    }

}