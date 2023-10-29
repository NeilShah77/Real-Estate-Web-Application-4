package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	public static Connection dbCon()
	{
		Connection con=null;
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/Real_Estate_Application";
		String user="postgres";
		String pass="Dhruv@hawk1805";
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pass);
		}
		catch(SQLException ex)
		 {
			ex.printStackTrace();
		 }catch (ClassNotFoundException e1) {
			 e1.printStackTrace();
		 }
		return con;
	}

}
