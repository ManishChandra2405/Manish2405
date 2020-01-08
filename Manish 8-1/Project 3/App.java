package com.deloitte.fourthmvn.firstspringapp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.deloitte.fourthmvn.firstspringapp.beans.Person;
import com.deloitte.fourthmvn.firstspringapp.beans.Wisher;
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	Person p1 = context.getBean(Person.class,"per1");
    	System.out.println(p1.getSsn()+" "+p1.getName());
    	System.out.println(p1.getAddress().getHno()+" "+p1.getAddress().getCity());
    	System.out.println(p1.getAddress().getState());
       	context.close();
    }
}
