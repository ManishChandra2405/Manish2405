class Employee
{
  private String Ename;
  private int Empid;
  double Salary;
  public Employee(){}
  public Employee(int Empid,String Ename,double Salary)
  {
   this.Ename=Ename;
   this.Empid=Empid;
   this.Salary=Salary;
   }
public String toString()
 {
  return "Empid is "+Empid+"\nEname is "+Ename+"\nSalary is "+Salary;
  }
}
class Test5
{
  public static void main(String[] args)
  {
   Employee x = new Employee(1,"Manish",20000);
   System.out.println(x);
   }
}
   

