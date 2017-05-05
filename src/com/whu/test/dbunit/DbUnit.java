/**
 * 
 */
package com.whu.test.dbunit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author hongliang
 *
 */
public class DbUnit {
	
	public static Connection getConnection() throws Exception
	{
		Connection con=null;
		//sessionVariables=FOREIGN_KEY_CHECKS=0表示忽略外键关联
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hstest?sessionVariable=FOREIGN_KEY_CHECKS=0","root","1234");
		return con;
	}
	
	public static void close(Connection con)
	{
		try
		{
			if(con!=null)
				con.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs)
	{
		try
		{
			if(rs!=null)
				rs.close();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
}
