package com.del.test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.test.dao.CoursesDAO;
import com.del.test.entity.Courses;
@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		CoursesDAO cdao = new CoursesDAO();
		Courses c = new Courses();
		String message="";
		c.setCourse_id(Integer.parseInt(request.getParameter("course_id")));
		RequestDispatcher rd = request.getRequestDispatcher("CoursesCrud.jsp");
		if(submit.equals("Add_Courses") || submit.equals("Modify_Courses"))
		{
			c.setCourse_name(request.getParameter("course_name"));
			c.setCourse_duration(Integer.parseInt(request.getParameter("course_duration")));
			c.setCourse_fee(Double.parseDouble(request.getParameter("course_fee")));
			
			if(submit.equals("Add_Courses"))
			{
				cdao.insertCourses(c);
				message=message+"Courses inserted";
			}
			else 
			{
				cdao.modifyCourses(c);
				message=message+"Courses Modified";
			}
		}
			else if(submit.equals("Delete_Courses"))
			{
				if(cdao.removeCourses(c.getCourse_id()))
				{
					message=message+"Deleted Courses";
				}
				else
					message="deletion failed";
			}
			else if(submit.equals("Show_Employee"))
			{
				c = cdao.getCourses(c.getCourse_id());
				request.setAttribute("courses", c);
			}
			out.print("<h1><center>"+message+"</center></h1>");
			rd.include(request,response);
	}
}

		     
