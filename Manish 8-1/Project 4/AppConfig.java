package com.deloitte.fourthmvn.firstspringapp.config;
import org.springframework.context.annotation.Configuration;
import com.deloitte.fourthmvn.firstspringapp.beans.Address;
import com.deloitte.fourthmvn.firstspringapp.beans.Person;

import org.springframework.context.annotation.Bean;
@Configuration
public class AppConfig 
{
	@Bean
	public Address address()
	{
		return new Address("5-6-7","Chennai","Karnataka");
	}
	@Bean
	public Person person()
	{
		return new Person(101,"Manish",address());
	}

}
