package com.del.dao;

import java.sql.Date;
import java.util.ArrayList;

import com.del.entity.Employee;

class DbTest16 
{

	public static void main(String[] args) 
	{
		EmployeeDAO edao = new EmployeeDAO();
		Employee e =edao.getEmployee(2);
		if(e!=null)
			System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getSalary());
		else
			System.out.println("Employee with id does not exist");
	}

}
