class Employee
{
private int empid;
private String ename;
private double salary;
 public Employee(){}
  public Employee(int empid,String ename,double salary)
  {
   this.empid=empid;
   this.ename=ename;
   this.salary=salary;
   }
public void setempid(int empid)
{
 this.empid=empid;
}
public void setename(String Ename)
{
 this.ename=ename;
}
public void setsalary(double salary)
{
 this.salary=salary;
}
public int getempid()
{
return empid;
}
public String getename()
{
return ename;
}
public double getsalary()
{
return salary;
}
}
class Department
{
 int deptno;
 String dname;
 Employee[] e;
 public Department(){}
 public Department(int deptno,String dname,Employee[] e)
 {
 this.deptno=deptno;
 this.dname=dname;
 this.e=e;
 }
  public void setdname()
 {
 this.dname=dname;
 }
 public void setdeptno()
 {
 this.deptno=deptno;
 }
 public void setEmployee(Employee[] e)
 {
 this.e=e;
 }
 public int getdeptno()
 {
 return deptno;
 }
 public String getdname()
 {
 return dname;
 }
 public Employee[] getEmployee()
 {
 return e;
 }
 }
class Test8
{
 public static void main(String[] args)
 {
  Employee[] e1={ new Employee(1,"Manish",1000),new Employee(2,"Jan",2000),new Employee(3,"Kow",3000)};
  Department d= new Department(1,"Finance",e1);
  System.out.println(d.getdeptno());
  System.out.println(d.getdname());
  System.out.println("employee details");
  Employee[] e2=d.getEmployee();
  for(int i=0;i<e2.length;i++)
   {
    System.out.println(e2[i].getempid());
    System.out.println(e2[i].getename());
    System.out.println(e2[i].getsalary());
	System.out.println();
   }
 } 
}

