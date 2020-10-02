package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/New")
public class New extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String balance = request.getParameter("bal");
		
		if(uname.equals("") || pass.equals("") || balance.equals(""))
			response.sendRedirect("enterdetails.jsp");
		else
		{
			float bal = Float.parseFloat(balance);
		
			LoginDao dao = new LoginDao();
			dao.createAccount(uname, pass, bal);
		
			response.sendRedirect("login.jsp");
		}
	}

}
