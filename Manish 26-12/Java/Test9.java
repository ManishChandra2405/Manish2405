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
 Employee e;
 public Department(){}
 public Department(int deptno,String dname,Employee e)
 {
 this.deptno=deptno;
 this.dname=dname;
 this.e=e;
 }
 public void setdeptno()
 {
 this.deptno=deptno;
 }
  public void setdname()
 {
 this.dname=dname;
 }
 public void setEmployee()
 {
 this.e=e;
 }
 public int getDeptno()
 {
 return deptno;
 }
 public String getDname()
 {
 return dname;
 }
 public Employee getEmployee()
 {
 return e;
 }
 }
class Test9
{
 public static void main(String[] args)
 {
 Department e= new Department(1,"Finance",new Employee(1,"Manish",20000));
 System.out.println(e.getDeptno());
 System.out.println(e.getDname());
 System.out.println("employee details");
 System.out.println(e.getEmployee().getempid());
 System.out.println(e.getEmployee().getename());
 System.out.println(e.getEmployee().getsalary());
  }
}

