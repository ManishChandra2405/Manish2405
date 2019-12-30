class Employee
{
  private String ename;
  private int empid;
  double salary;
  public Employee(){}
  public Employee(int empid,String ename,double salary)
  {
   this.ename=ename;
   this.empid=empid;
   this.salary=salary;
   }
public void setEmpid(int empid)
{
 this.empid=empid;
}
public void setEname(String Ename)
{
 this.ename=ename;
}
public void setSalary(double salary)
{
 this.salary=salary;
}
public int getEmpid()
{
 return empid;
}
public String getEname()
{
 return ename;
}
public double getSalary()
{
 return salary;
}
}
class Test4
{
  public static void main(String[] args)
  {
   Employee x = new Employee(1,"Manish",20000);
   System.out.println("empid is "+x.getEmpid());
   System.out.println("name is " +x.getEname());
   System.out.println("salary is"+x.getSalary());
   }
}
   

