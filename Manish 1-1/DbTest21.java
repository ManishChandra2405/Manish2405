package com.del.dao;


import com.del.entity.Student;

public class DbTest21 
{

	public static void main(String[] args) 
	{
		StudentDAO sdao = new StudentDAO();
		Student s = sdao.getStudent(2);
		if(s!=null)
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getAge());
		else
			System.out.println("Student with rno does not exist");
	}

}
