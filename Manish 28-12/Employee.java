import java.util.HashSet;
import java.util.Iterator;
class Employee
{
 int empid;
 String name;
 double salary;
 public Employee(){}
 public Employee(int empid,String name,double salary)
  {
   this.empid=empid;
   this.name=name;
   this.salary=salary;
  } 
 public void display()
  {
    System.out.println(empid+" "+name+" "+salary);
  }
 public int hashCode()
 {
   return empid;
 }
 public boolean equals(Object obj)
 {
  Employee e = (Employee)obj;
  return empid==e.empid&&name.equals(e.name)&&salary==e.salary;
 }
}