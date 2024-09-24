package vn.thuhang.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import vn.thuhang.models.UserModel;

public class DBConnectMySQL {
	private static String DB_URL = "jdbc:mysql://localhost:3306/ltweb_04";
	private static String USER_NAME = "root";
	private static String PASSWORD = "Vtth2004@";
	private static String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	public static Connection getConnection() throws SQLException, Exception {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	}
	
	public static void main(String[] args) {
		try {
			new DBConnectMySQL();
			System.out.println(DBConnectMySQL.getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean register(String username, String email, String password, String fullname, String images) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean changePassword(String username, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	public UserModel findByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
