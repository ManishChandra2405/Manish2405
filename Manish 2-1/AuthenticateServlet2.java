package com.del.first.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import com.del.first.dao.UsersDAO;
import com.del.first.entity.Users;
@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends GenericServlet
{
  public void service(ServletRequest request,ServletResponse response) throws IOException, ServletException
   {
	  response.setContentType("text/html");
	  String username=request.getParameter("uid");
	  String password=request.getParameter("pwd");
	  Users u = new Users(username,password);
	  RequestDispatcher rd = null;
	  PrintWriter out = response.getWriter();
	  out.println("<h1><center>");
	  if(new UsersDAO().validateUser(u))
		out.println("Welcome to  Website");
	  else
	  {
		out.println("Invalid Username / Password");
		rd = request.getRequestDispatcher("login.html");
		rd.include(request, response);
	  }
	   out.println("</center></h1>");
  }
}
