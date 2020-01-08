package com.deloitte.fourthmvn.firstspringapp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.deloitte.fourthmvn.firstspringapp.beans.Wisher;
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	Wisher w1 = (Wisher)context.getBean("wish1");
    	System.out.println(w1.getMessage());
    	Wisher w2 = (Wisher)context.getBean("wish1");
    	context.close();
    }
}
