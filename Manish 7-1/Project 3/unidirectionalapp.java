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
        Person p1= session.get(Person.class,"Manish" );
        if(p1!=null)
        {
        	System.out.println(p1.getAddress()+" "p1.getAge());
        	AadharCard ac = p1.getAcard();
        	System.out.println(ac.getAid()+" "+ac.getIssueAuth()+" "+ac.getIssueDate());
        }
        
        session.close();
        factory.close();        
    }
}
