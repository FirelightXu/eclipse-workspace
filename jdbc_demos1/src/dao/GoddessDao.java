package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import jdbc_demos1.jdbcdemos;

import model.goddess;

public class GoddessDao {
	//用goddess g来传入数据  你是要从前台传入数据，而不是说把数据写死了
	public void addGoddess(goddess g) throws SQLException {
		Connection conn = jdbcdemos.getConnection();
		String sql = "insert into imooc_goddess(user_name,sex,age,email,mobile,create_user,isdel)values(?,?,?,?,?,?,?)";
		//新的一种SQL语句的执行方法：预编译
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setString(4, g.getEmail());
		ptmt.setString(5, g.getMobile());
		ptmt.setString(6, g.getCreate_user());
		ptmt.setInt(7, g.getIsdel());
		
		ptmt.executeUpdate();
	}
	
	public void updateGoddess(goddess g)throws SQLException {
		Connection conn = jdbcdemos.getConnection();
		String sql = "update imooc_goddess set user_name=? where id=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1,g.getUser_name());
		ptmt.setInt(2, g.getId());
		ptmt.executeUpdate();
	}
	public void delGoddness(Integer id) throws SQLException {
		Connection conn = jdbcdemos.getConnection();
		String sql = "delete from imooc_goddess where id =?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setInt(1, id);
		ptmt.executeUpdate();
		
	}
	public List<goddess> query() throws Exception{
		Connection conn = jdbcdemos.getConnection();
		Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT user_name,age From imooc_goddess");
        //如果有数据，rs.next()返回true
        
        List<goddess> gs = new ArrayList<goddess>();
        goddess g = null;
        
        
        while(rs.next()) {
        	g= new goddess();
        	g.setUser_name(rs.getString("user_name"));
        	g.setAge(rs.getInt("age"));
        	
        	gs.add(g);
//        	System.out.println(rs.getString("user_name")+" 年龄："+rs.getInt("age"));
        }
		
		return gs;
	}
	public goddess get(Integer id)throws SQLException {
		goddess g = null;
		Connection conn = jdbcdemos.getConnection();
		String sql = "select * from imooc_goddess where id =?";
		
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, id);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()) {
			g=new goddess();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			
		}
		return g;
	}
}
