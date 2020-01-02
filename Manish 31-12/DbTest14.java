package com.del.dao;

import java.sql.Date;

import com.del.entity.Employee;

class DbTest14 
{

	public static void main(String[] args) 
	{
		Employee e = new Employee(2,"Kona Kowsalya",5000,new Date(1990,11,12));
		EmployeeDAO edao = new EmployeeDAO();
		if(edao.modifyEmployee(e))
			System.out.println("Employee Record Updated");
		else
			System.out.println("Updation failed");
	}

}
