package com.del.dao;

import java.sql.Date;

import com.del.entity.Employee;

class DbTest13 
{

	public static void main(String[] args) 
	{
		Employee e = new Employee(2,"Kowsalya",4000,new Date(1990,11,12));
		EmployeeDAO edao = new EmployeeDAO();
		if(edao.insertEmployee(e))
			System.out.println("Employee Record Inserted");
		else
			System.out.println("Insertion failed");
	}

}
