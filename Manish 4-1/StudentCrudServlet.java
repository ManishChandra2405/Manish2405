package com.del.third;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.third.dao.StudentDAO;
import com.del.third.entity.Student;
@WebServlet("/StudentCrudServlet")
public class StudentCrudServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		StudentDAO sdao = new StudentDAO();
		Student s = new Student();
		String message="";
		s.setRno(Integer.parseInt(request.getParameter("rno")));
		if(submit.equals("Add_Student") || submit.equals("Modify_Student"))
        {
	       s.setName(request.getParameter("name"));
	       s.setAge(Integer.parseInt(request.getParameter("age")));
	       s.setDob(Date.valueOf(request.getParameter("dob")));
	       if(submit.equals("Add_Student"))
	       {
	    	   sdao.insertStudent(s);
	    	   message=message+"inserted record";
	       }
	       else 
	       {
	    	   sdao.modifyStudent(s);
	    	   message=message+"modified record";
	       }
        }
		else if(submit.equals("Delete_Student"))
		{
			if(sdao.removeStudent(s.getRno()))
			{
				message=message+"Deleted Student";
			}
			else
				message="deletion failed";
		}
		out.print("<h1><center>"+message+"</center></h1>");
	       }
	    	   
        }
