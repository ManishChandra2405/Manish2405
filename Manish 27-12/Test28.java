import java.util.LinkedHashSet;
import java.util.Iterator;
class Test28
{
  public static void main(String[] args)
   {
     LinkedHashSet<Employee> hs = new LinkedHashSet<Employee>();
     hs.add(new Employee(1,"Manish",1000));
     hs.add(new Employee(3,"Sundeep",6000));
     hs.add(new Employee(2,"Sunil",2000));
     hs.add(new Employee(2,"Sunil",2000));
     for(Employee e : hs)
     e.display();
    }
} 