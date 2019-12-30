class Employee
{
private int Empid;
private String Ename;
private double Salary;
 public Employee(){}
  public Employee(int Empid,String Ename,double Salary)
  {
   this.Empid=Empid;
   this.Ename=Ename;
   this.Salary=Salary;
   }
public void setEmpid(int Empid)
{
 this.Empid=Empid;
}
public void setEname(String Ename)
{
 this.Ename=Ename;
}
public void setSalary(double Salary)
{
 this.Salary=Salary;
}
public  int getEmpid()
{
 return Empid;
}
public  String  getEname()
{
 return Ename;
}
public  double getSalary()
{
 return Salary;
}
public boolean equals(Object obj)
 {
  Employee e=(Employee)obj;
  return Empid==e.Empid&&Ename.equals(e.Ename)&&Salary==e.Salary;
 }
}
class Department
{
 int Deptno;
 String Dname;
 Employee e;
 public Department(){}
 public Department(int Deptno,String Dname,Employee e)
 {
 this.Deptno=Deptno;
 this.Dname=Dname;
 this.e=e;
 }
  public void setDeptno(int Deptno)
 {
 this.Deptno=Deptno;
 }
 public void setDname(String Dname)
 {
 this.Dname=Dname;
 }
 public  void setEmployee(Employee e)
 {
 this.e=e;
 }
 public  int getDeptno()
 {
 return Deptno;
 }
 public  String getDname()
 {
 return Dname;
 }
 public Employee getEmployee()
 {
 return e;
 }
 }
class Test10
{
 public static void main(String[] args)
 {
  Employee e1=new Employee(1,"Manish",100);
  Employee e2=new Employee(1,"Manish",100);
  System.out.println(e1.equals(e2));
 } 
}

