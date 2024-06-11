package com.dao;

import java.sql.Connection;

import com.mysql.cj.jdbc.MysqlDataSource;


public class ConnectionFactory {
	private static Connection con;

	@SuppressWarnings("finally")
	public static Connection getConnection() 
	{
		try {
			MysqlDataSource mysql = new MysqlDataSource();
			mysql.setURL("jdbc:mysql://localhost:3306");
			mysql.setUser("root");
			mysql.setPassword("");
			con= mysql.getConnection();
			
			
		} catch (Exception e) {

			System.out.println("Connectionfactory->getConnection: "+e);
			
		}
		finally {
			return con;
		}

	}

}
