package com.internousdev.webproj5.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	/**
	 * JDBCドライバー名
	 */
	private static String driverName="com.mysql.jdbc.Driver";
		/**
		 * データベース接続 URL
		 */
	private static String url="jdbc:mysql://localhost/testdb_fujimura5";
	/**
	 * データベース接続　ユーザ名
	 */
	private static String user="root";
	/**
	 * データベース接続パスワード
	 */
	private static String password="fujimon3924692mikumikuYANDElion";

	public Connection getConnection(){
		Connection con=null;
		try{
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
