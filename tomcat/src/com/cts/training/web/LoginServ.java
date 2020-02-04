package com.cts.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		
		//in req scope
		request.setAttribute("username", uname.toUpperCase());
		request.setAttribute("password", upass.concat("Check"));
		
		
		
		//in session scope ,for that add session obj
		HttpSession session=request.getSession();
		session.setAttribute("username", uname.toUpperCase());
		session.setAttribute("password", upass.concat("Check"));
		
		
		
		
		//in global scope
		ServletContext contex=this.getServletContext();
		contex.setAttribute("username", uname.toUpperCase());
		contex.setAttribute("password", upass.concat("Check"));
				
		
		//redirecting to html pages
		/*if(uname.equals("First")&& upass.equals("abc")) {
			
			response.sendRedirect("welcome.html");
			
		}
		else {
			response.sendRedirect("error.html");
		}
*/		
		
		//using forward and despatch
		if(uname.equals("First")&& upass.equals("abc")) {
			this.getServletContext().getRequestDispatcher("/welcome.jsp").forward(request,response);
			
			
		}
		else { 
			this.getServletContext().getRequestDispatcher("/error.html").forward(request,response);
		}
	}
	

}
