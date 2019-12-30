import java.util.HashSet;
import java.util.Iterator;
class Test27
{
  public static void main(String[] args)
   {
     HashSet<Employee> hs = new HashSet<Employee>();
     hs.add(new Employee(1,"Manish",1000));
     hs.add(new Employee(2,"Sunil",2000));
     hs.add(new Employee(2,"Sunil",2000));
     for(Employee e : hs)
     e.display();
    }
} 