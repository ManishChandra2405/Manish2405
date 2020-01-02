package com.del.dao;

public class DbTest22 
{

	public static void main(String[] args) 
	{
		StudentDAO sdao = new StudentDAO();
		if(sdao.removeStudent(1))
			System.out.println("Student Deleted");
		else
			System.out.println("Student not deleted");
	}

}
