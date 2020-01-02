package com.del.dao;

import java.sql.Date;
import java.util.ArrayList;

import com.del.entity.Employee;

class DbTest15 
{

	public static void main(String[] args) 
	{
		EmployeeDAO edao = new EmployeeDAO();
		ArrayList<Employee> elist = edao.getEmployee();
		for(Employee e : elist)
			System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getSalary());
	}

}
