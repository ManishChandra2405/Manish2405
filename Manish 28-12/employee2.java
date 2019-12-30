import java.util.TreeSet;
import java.util.Iterator;
class Employee implements Comparable<Employee>
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
 public int compareTo(Employee e)
 {
   return empid- e.empid;
 }
}