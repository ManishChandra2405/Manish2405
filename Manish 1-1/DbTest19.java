package com.del.dao;

import java.sql.Date;


import com.del.entity.Student;

public class DbTest19 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("deprecation")
		Student s = new Student(2,"Kona Kowsalya",21,new Date(2019,06,10));
		StudentDAO sdao = new StudentDAO();
		if(sdao.modifyStudent(s))
			System.out.println("Student Record Updated");
		else
			System.out.println("Updation failed");
	}

}
