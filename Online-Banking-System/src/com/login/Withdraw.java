package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Withdraw")
public class Withdraw extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = "", pass = "", wmoney = request.getParameter("wmoney");
		
		if(wmoney.equals(""))
			response.sendRedirect("account.jsp");
		else
		{
			Cookie cookies[] = request.getCookies();
			for(Cookie c : cookies)
			{
				if(c.getName().equals("username"))
					uname = c.getValue();
				if(c.getName().equals("password"))
					pass = c.getValue();
			}
			LoginDao dao = new LoginDao();
			
			float bal = dao.check(uname, pass);
			
			if(Float.parseFloat(wmoney)>bal)
				response.sendRedirect("error.jsp");
			else
			{
				float ubalance = bal - Float.parseFloat(wmoney);
				dao.updateBalance(uname, pass, ubalance);
					
				bal = dao.check(uname, pass);
				HttpSession session = request.getSession();
				session.setAttribute("ubal", bal);
				response.sendRedirect("deposit.jsp");
			}
		}
	}
}
