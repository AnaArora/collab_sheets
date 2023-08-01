
package SQLConnection;

import java.io.*;
import java.sql.*;

import javax.swing.JOptionPane;

public class SqlConnectionFile {

	String url = "jdbc:mysql://localhost:3307/"; 
	String dbName = "userdb";
	String driver = "com.mysql.jdbc.Driver";  
	String userName = "root";  
	String password = "Vada121924@28";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement prep = null;
	public ResultSet sqlConnectionDetails(String query) {
		
		try {
	         // register JDBC driver
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         // create JDBC connection
	         con = DriverManager.getConnection("jdbc:mysql://localhost:3307/userdb", "root", "Vada121924@28");
	        if(con != null) {
	        	System.out.println("Connection Status: true");
	        	prep = con.prepareStatement(query);
	        	rs = prep.executeQuery();
				/*
				 * while (rs.next()) { int foo = rs.getRow(); System.out.println(foo); }
				 */
	        	//ResultSet rs = prep.executeQuery();
	        	System.out.println(rs);
				/*
				 * System.out.println(rs.getFetchSize()); System.out.println(rs.getObject(0));
				 */
	        	//for(int i=0; i=<resultlength; i++) {
	        		
	        	//}
	        	return rs;
	        }
			/*
			 * System.out.println("Connection Status: false"); return false;
			 */
	        return null;

	       }catch (Exception e) {
	          e.printStackTrace();
	       }
		finally {
			//rs.close;
		}
		System.out.println("Connection Status: false");
		return null;
		
	}
	
	public boolean loginCheck(String username, String password) {		
		String query = "SELECT * FROM userdb.login_accounts WHERE username='"+username+"' and password='"+password+"'";
		try {
		ResultSet rs = sqlConnectionDetails(query);
		ResultSetMetaData metadata = rs.getMetaData();
	    int columnCount = metadata.getColumnCount();    
	    for (int i = 1; i <= columnCount; i++) {
	        System.out.println(metadata.getColumnName(i) + ", ");      
	    }
		String row = "";
 
        if(rs.next())
		{ 
			int foo = rs.getInt(1);
			System.out.println(foo);
			return true;
		}
		else {
			return false;
		}
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		/*
		 * if(constatus == true) { System.out.println("Connection Successfully");
		 * 
		 * 
		 * } else { System.out.println("Connection Failed"); }
		 */
		return false;
	}
}
