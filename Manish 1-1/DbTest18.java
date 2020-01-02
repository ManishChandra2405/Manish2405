package com.del.dao;

import java.sql.Date;


import com.del.entity.Student;

public class DbTest18 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("deprecation")
		Student s = new Student(2,"Kowsalya",21,new Date(2019,06,10));
		StudentDAO sdao = new StudentDAO();
		if(sdao.insertStudent(s))
			System.out.println("Student Record Inserted");
		else
			System.out.println("Insertion failed");
	}

}
