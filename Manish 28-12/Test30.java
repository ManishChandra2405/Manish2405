import java.util.TreeSet;
import java.util.Iterator;
class Test30
{
  public static void main(String args[])
   {  
     TreeSet<Employee> tset = new TreeSet<Employee>();
     tset.add(new Employee(1,"Manish",1000));
     tset.add(new Employee(2,"Sunil",2000));
     tset.add(new Employee(3,"Kowsy",3000));
     for(Employee e : tset)
      e.display();
    }
}