package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		if (uname.equals("akanksha")&& pass.equals("HeyRam"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);

			response.sendRedirect("welcome.jsp");
		}
		
		else
		{
			response.sendRedirect("login.jsp");
		}
		
	}

}
