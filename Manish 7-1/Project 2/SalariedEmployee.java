package com.deloitte.secondmvn.hib2.entity;
import javax.persistence.DiscriminatorValue;
import org.hibernate.annotations.Entity;
@DiscriminatorValue("Salaried")
@Entity
public class SalariedEmployee extends Employee
{
	double salary;
	public SalariedEmployee() {}
	public SalariedEmployee(int empid,String ename,double salary) {
		super(empid,ename);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
