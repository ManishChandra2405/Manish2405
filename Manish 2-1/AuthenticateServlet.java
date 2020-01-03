package com.del.first.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends GenericServlet
{
  public void service(ServletRequest request,ServletResponse response) throws IOException, ServletException
   {
	  response.setContentType("text/html");
	  String username=request.getParameter("uid");
	  String password=request.getParameter("pwd");
	  RequestDispatcher rd = null;
	  PrintWriter out = response.getWriter();
	  out.println("<h1><center>");
	  if(username.equalsIgnoreCase("Deloitte") && password.equals("nexwave"))
		out.println("Welcome to the Website");
	  else
	  {
		out.println("Invalid Username / Password");
		rd = request.getRequestDispatcher("login.html");
		rd.include(request, response);
	  }
	   out.println("</center></h1>");
  }
}
