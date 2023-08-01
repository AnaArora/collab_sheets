

import java.util.regex.*;    

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String pass=request.getParameter("pass");
		
//		if (pass.length() < 8) response.sendRedirect("login.jsp");
//
//        int charCount = 0;
//        int numCount = 0;
//        for (int i = 0; i < pass.length(); i++) {
//
//            char ch = pass.charAt(i);
//
//            if (is_Numeric(ch)) numCount++;
//            else if (is_Letter(ch)) charCount++;
//            else response.sendRedirect("login.jsp");
            
		
		String regex = "^[A-Za-z0-9]"+"@mea\\.gov\\.in";
		

 // Compile the ReGex
 Pattern p = Pattern.compile(regex);

 // If the password is empty
 // return false
 if (pass == null || username==null) {
	 response.sendRedirect("login.jsp");
 }
 
 else if(Pattern.compile(regex)
	      .matcher(username)
	      .matches()) {
	 response.sendRedirect("welcome.jsp");
 }
	}
}
//	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
//	                            "[a-zA-Z0-9_+&*-]+)*@" +
//	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//	                            "A-Z]{2,7}$";
//	                              
//	        Pattern pat = Pattern.compile(emailRegex);
//	        if (ename == null )
//	        	response.sendRedirect("login.jsp");
//	        response.sendRedirect("welcome.jsp");
//	    }

	
