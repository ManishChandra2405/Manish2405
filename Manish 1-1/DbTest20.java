package com.del.dao;

import java.util.ArrayList;


import com.del.entity.Student;

public class DbTest20 
{

	public static void main(String[] args) 
	{
		StudentDAO sdao = new StudentDAO();
		ArrayList<Student> slist = sdao.getStudent();
		for(Student s : slist)
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getAge());
	}

}
