package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Deleteacc")
public class Deleteacc extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pass = request.getParameter("pass");		
		String uname="";
		
		Cookie cookies[] = request.getCookies();
		for(Cookie c : cookies)
		{
			if(c.getName().equals("username"))
				uname = c.getValue();
		}
								
		if(pass.equals(""))
			response.sendRedirect("delete.jsp");
		else
		{
			LoginDao dao = new LoginDao();
			boolean res = dao.deleteAccount(uname, pass);
		
			if(res)
			{
				HttpSession session = request.getSession();
				session.removeAttribute("username");
				session.invalidate();
				response.sendRedirect("login.jsp");
			}
			else
				response.sendRedirect("delete.jsp");
		}
	}

}














