package org.gvignesh.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbManager {
	
	private static Connection conn = ConnectionManager.getInstance().getConnection();
	public static void Insert(GetsSets set) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		
		String sql	=	"INSERT INTO register (fname,lname,gender,state,email,password,age,address,skill) VALUES(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, set.getFname());
		pstmt.setString(2, set.getLname());
		pstmt.setString(3, set.getGender());
		pstmt.setString(4, set.getState());
		pstmt.setString(5, set.getEmail());
		pstmt.setString(6, set.getPassword());
		pstmt.setString(7, set.getAge());
		pstmt.setString(8, set.getAddress());
		pstmt.setString(9, set.getSkill());
		pstmt.executeUpdate();
		ConnectionManager.getInstance().close();		
	}
	
	public static int checkUser(GetsSets get) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		
		String sql	=	"SELECT COUNT(*) FROM register WHERE email=? AND password=?";
		PreparedStatement pstmt	=	conn.prepareStatement(sql);
		pstmt.setString(1, get.getEmail());
		pstmt.setString(2, get.getPassword());
		ResultSet rs	=	pstmt.executeQuery();
		
		int count = 0;
		while(rs.next()){
			count	=	rs.getInt(1);
		}
		ConnectionManager.getInstance().close();
		return count;
		
	}

}
