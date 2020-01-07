package com.deloitte.secondmvn.hibthird;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.secondmvn.hibthird.entity.AadharCard;
import com.deloitte.secondmvn.hibthird.entity.Person;
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        @SuppressWarnings("deprecation")
		AadharCard ac = new AadharCard(7001,"Govt of India",new Date(2020,1,1));
        Person p1= new Person("Manish",23,"Kondapur",ac);
        Transaction trans = session.beginTransaction();
        session.save(ac);
        session.save(p1);
        trans.commit();
        session.close();
        factory.close();        
    }
}
