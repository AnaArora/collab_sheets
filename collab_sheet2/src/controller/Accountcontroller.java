package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import SQLConnection.SqlConnectionFile;

/**
 * Servlet implementation class Accountcontroller
 */
@WebServlet("/account")
public class Accountcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	/*
	 * public Accountcontroller() { super(); // TODO Auto-generated constructor stub
	 * }
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("account/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		System.out.println("dopost function");
		try {
			//SqlConnectionFile sqlcon = new SqlConnectionFile();
			//sqlcon.sqlConnectionDetails();
		HttpSession session=request.getSession();
		String captcha=session.getAttribute("captcha_security").toString();
		String verifyCaptcha=request.getParameter("captcha-form");
		System.out.println("cap"+captcha);
		System.out.println("cap"+verifyCaptcha);
		if(captcha.equals(verifyCaptcha)) {
			String username = request.getParameter("ename");
			String password = request.getParameter("pass");
			SqlConnectionFile sqlCon = new SqlConnectionFile();
			boolean status = sqlCon.loginCheck(username, password);
			if(status) {
			/*
			 * request.setAttribute("username", request.getParameter("username"));
			 * request.setAttribute("pass", request.getParameter("pass"));
			 */
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			}
			else {
				request.setAttribute("error", "Incorrect username and password");
				response.sendRedirect("login.jsp");
			}

		}else {
			System.out.println("enter dopost function");
			request.setAttribute("error", "Captcha Invalid");
			//request.getRequestDispatcher("account/login.jsp").forward(request, response);
			response.sendRedirect("login.jsp");
		}
		}
		catch(Exception e) {
			//e.getMessage();
			
		}
		
	}

}
