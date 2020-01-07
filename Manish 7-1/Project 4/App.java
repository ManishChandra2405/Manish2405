package com.deloitte.secondmvn.hibthird;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.deloitte.secondmvn.hibthird.entity.Department;
import com.deloitte.secondmvn.hibthird.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Employee e1 = new Employee(101,"Manish",100);
        Employee e2 = new Employee(102,"Munna",200);
        Employee e3 = new Employee(103,"Chandra",300);
        Employee e4 = new Employee(104,"Kowsalya",400);
        ArrayList<Employee> el1 = new ArrayList<Employee>();
        ArrayList<Employee> el2 = new ArrayList<Employee>();
        el1.add(e1);
        el1.add(e3);
        el2.add(e2);
        el2.add(e4);
        Department d1 = new Department(10,"Sales",el1);
        Department d2 = new Department(20,"Marketing",el2);
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(e4);
        session.save(d1);
        session.save(d2);
        session.beginTransaction().commit();
        session.close();
        factory.close();        
    }
}
