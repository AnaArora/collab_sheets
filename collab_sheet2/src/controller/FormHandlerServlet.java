package controller;

//
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class FormHandlerServlet
// */
//@WebServlet("/FormHandlerServlet")
//public class FormHandlerServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public FormHandlerServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter pw=res.getWriter();
//		
//		res.serContentType("text/hmtl");
//		
//		String country = request.getParameter("first-dropdown");
//        String city = request.getParameter("second-dropdown");
//        int allowedUsers = Integer.parseInt(request.getParameter("tuser"));
//        String loginAccount = request.getParameter("loginacc");
//        String accountStatus = request.getParameter("Activate");
//        System.out.println(country);
//        
//		request.getRequestDispatcher("account/index.jsp").forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
////	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		// TODO Auto-generated method stub
////		doGet(request, response);
////		
////		
////		
////	}
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//
//        // JDBC connection parameters
//        String url = "jdbc:mysql://localhost:3307/userdb";
//        String username = "root";
//        String password = "Vada121924@28";
//
//        Connection connection = null;
//        PreparedStatement statement = null;
//
//        try {
//            // Register JDBC driver (if not done already)
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Create a connection
//            connection = DriverManager.getConnection(url, username, password);
//
//            // Prepare the SQL INSERT statement
//            String sql = "INSERT INTO user_accounts (Country, City, allowed_users, login_account, accounta/d) " + "VALUES (?, ?, ?, ?, ?)";
//
//            // Create a prepared statement
//            statement = connection.prepareStatement(sql);
//
//            // Bind the form data to the statement
//            statement.setString(1, country);
//            statement.setString(2, city);
//            statement.setInt(3, allowedUsers);
//            statement.setString(4, loginAccount);
//            statement.setString(5, accountStatus);
//
//            // Execute the INSERT statement
//            statement.executeUpdate();
//
//            // Redirect back to the form page or show a success message
//            response.sendRedirect("display.jsp?success=true");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            // Handle the ClassNotFoundException scenario
//            response.sendRedirect("xyz.jsp?success=false");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            // Handle the SQLException scenario
//            response.sendRedirect("xyz.jsp?success=false");
//        } finally {
//            // Close the resources in the reverse order of their creation
//            try {
//                if (statement != null) {
//                    statement.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//	
//
//}


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class FormHandlerServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

    //create the query
    private static final String INSERT_QUERY ="INSERT INTO userdb.tm_mea_divisions(Country,City,allowed_users,login_account, accountda)  VALUES(?,?,?,?,?);";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //get PrintWriter
        PrintWriter pw = res.getWriter();
        //set Content type
        res.setContentType("text/hmtl");
        //read the form values
        String country = req.getParameter("first-dropdown");
      String city = req.getParameter("second-dropdown");
      int allowedUsers = Integer.parseInt(req.getParameter("tuser"));
      String loginAccount = req.getParameter("loginacc");
      String accountStatus = req.getParameter("Activate");
      System.out.println(country);

        //load the jdbc driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        create the connection
//        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/userdb","root","Vada121924@28");
//        		PreparedStatement ps = con.prepareStatement(INSERT_QUERY);){
//            //set the values
//            ps.setString(1, country);
//            ps.setString(2, city);
//            ps.setInt(3, allowedUsers);
//            ps.setString(4, loginAccount);
//            ps.setString(5, accountStatus);
//
//            //execute the query
//            int count = ps.executeUpdate();
//
//            if(count==0) {
//                pw.println("Record not stored into database");
//            }else {
//                pw.println("Record Stored into Database");
//            }
//        }catch(SQLException se) {
//            pw.println(se.getMessage());
//            se.printStackTrace();
//        }catch(Exception e) {
//            pw.println(e.getMessage());
//            e.printStackTrace();
//        }
//        
        try {
            Connection con = null;
            PreparedStatement ps = null;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/userdb", "root", "Vada121924@28");
                ps = con.prepareStatement(INSERT_QUERY);

                // Bind the form data to the statement
                ps.setString(1, country);
                ps.setString(2, city);
                ps.setInt(3, allowedUsers);
                ps.setString(4, loginAccount);
                ps.setString(5, accountStatus);

                // Execute the INSERT statement
                ps.executeUpdate();

                // Success handling (e.g., redirect or show a success message)
            } catch (SQLException e) {
                e.printStackTrace();
                // Error handling (e.g., redirect or show an error message)
            } finally {
                // Close resources in the reverse order of their creation
                if (ps != null) {
                    try {
                        ps.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //close the stream
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(req, resp);
    }
	
//	String url = "jdbc:mysql://localhost:3307/"; 
//	String dbName = "userdb";
//	String driver = "com.mysql.jdbc.Driver";  
//	String userName = "root";  
//	String password = "Vada121924@28";
//	Connection con = null;
//	ResultSet rs = null;
//	PreparedStatement prep = null;
//	public ResultSet sqlConnectionDetails(String query) {
//		
//		try {
//	         // register JDBC driver
//	         Class.forName("com.mysql.cj.jdbc.Driver");
//	         // create JDBC connection
//	         con = DriverManager.getConnection("jdbc:mysql://localhost:3307/userdb", "root", "Vada121924@28");
//	        if(con != null) {
//	        	System.out.println("Connection Status: true");
//	        	prep = con.prepareStatement(query);
//	        	rs = prep.executeQuery();
//				/*
//				 * while (rs.next()) { int foo = rs.getRow(); System.out.println(foo); }
//				 */
//	        	//ResultSet rs = prep.executeQuery();
//	        	System.out.println(rs);
//				/*
//				 * System.out.println(rs.getFetchSize()); System.out.println(rs.getObject(0));
//				 */
//	        	//for(int i=0; i=<resultlength; i++) {
//	        		
//	        	//}
//	        	return rs;
//	        }
//			/*
//			 * System.out.println("Connection Status: false"); return false;
//			 */
//	        return null;
//
//	       }catch (Exception e) {
//	          e.printStackTrace();
//	       }
//		finally {
//			//rs.close;
//		}
//		System.out.println("Connection Status: false");
//		return null;
//		
//	}
//	
//	public boolean loginCheck(String username, String password) {		
//		String query = "Insert into userdb.tm_mea_divisons(Country,City,allowed_users,login_account, 'accounta/d') VALUES(?,?,?,?,?);";
//		try {
//		ResultSet rs = sqlConnectionDetails(query);
//		ResultSetMetaData metadata = rs.getMetaData();
//	    int columnCount = metadata.getColumnCount();    
//	    for (int i = 1; i <= columnCount; i++) {
//	        System.out.println(metadata.getColumnName(i) + ", ");      
//	    }
//		String row = "";
// 
//        if(rs.next())
//		{ 
//			int foo = rs.getInt(1);
//			System.out.println(foo);
//			return true;
//		}
//		else {
//			return false;
//		}
//		
//		}catch(Exception e) {
//			e.printStackTrace();
//			
//		}
//		/*
//		 * if(constatus == true) { System.out.println("Connection Successfully");
//		 * 
//		 * 
//		 * } else { System.out.println("Connection Failed"); }
//		 */
//		return false;
	}
