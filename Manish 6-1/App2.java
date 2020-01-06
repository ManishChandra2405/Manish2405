package com.deloitte.firstmvn.hibfirst;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.firstmvn.hibfirst.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure();
       SessionFactory factory = cfg.buildSessionFactory();
       Session session  = factory.openSession();
       Employee e = session.get(Employee.class, 2);
       if(e!=null)
    	   System.out.println(e.getName()+" "+e.getSalary()+" "+e.getDoj());
       session.close();
       factory.close();
    }
}
