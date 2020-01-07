package com.deloitte.firstmvn.hibfirst.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Table;
@Entity
public class Employee 
{ 
	@Id
	@Column(name="empid",columnDefinition="number(4)")
	int empid;
	@Column(name="ename",length=20)
	String name;
	@Column(name="salary",columnDefinition="number(8,2)")
	double salary;
	Date doj;
	public Employee() {}
	public Employee(int empid, String name, double salary, Date doj) 
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	

}
