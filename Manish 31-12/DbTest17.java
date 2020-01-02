package com.del.dao;

import java.sql.Date;
import java.util.ArrayList;

import com.del.entity.Employee;

class DbTest17 
{

	public static void main(String[] args) 
	{
		EmployeeDAO edao = new EmployeeDAO();
		if(edao.removeEmployee(1))
			System.out.println("Employee Deleted");
		else
			System.out.println("Employee not deleted");
	}

}
