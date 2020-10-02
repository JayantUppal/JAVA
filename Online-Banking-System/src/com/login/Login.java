package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		Cookie cookie1 = new Cookie("username", uname);
		Cookie cookie2 = new Cookie("password", pass);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		LoginDao dao = new LoginDao();
		float bal = dao.check(uname, pass);
		
		Cookie cookie3 = new Cookie("balance", bal+"");
		response.addCookie(cookie3);
		
		if(bal!=-1)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			session.setAttribute("balance", bal);
			response.sendRedirect("account.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}
}
