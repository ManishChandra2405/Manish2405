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
       Employee e = new Employee(1,"Manish Chandra",21000,new Date(2020,1,28));
       Transaction trans = session.beginTransaction();
       session.saveOrUpdate(e);
       trans.commit();
       session.close();
       factory.close();
    }
}
