package jdbc_demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcdemos {

    public static final String URL = "jdbc:mysql://localhost:3306/javademo";
    public static final String USER = "root";
    public static final String PASSWORD = "";

    public static void main(String[] args) throws Exception {
        //1.������������
        Class.forName("com.mysql.jdbc.Driver");
        //2. ������ݿ�����
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.�������ݿ⣬ʵ����ɾ�Ĳ�
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate("create table student(NO char(20),name varchar(20),primary key(NO))");
        //��������ݣ�rs.next()����true
        if (result != -1) {
            System.out.println("�������ݱ�ɹ�");
        }
    }
}