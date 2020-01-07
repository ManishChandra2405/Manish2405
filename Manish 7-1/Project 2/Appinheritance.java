package com.deloitte.secondmvn.hib2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.secondmvn.hib2.entity.HourlyEmployee;
import com.deloitte.secondmvn.hib2.entity.SalariedEmployee;
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        SalariedEmployee se = new SalariedEmployee(1,"Manish",1000);
        HourlyEmployee he = new HourlyEmployee(2,"Kowsalya",50,31);
        Transaction trans = session.beginTransaction();
        session.save(se);
        session.save(he);
        trans.commit();
        session.close();
        factory.close();
        
    }
}
