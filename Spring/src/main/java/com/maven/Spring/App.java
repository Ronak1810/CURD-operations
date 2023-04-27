package com.maven.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
       Student s =(Student) ac.getBean("s");
       
       System.out.println(s.getName());
       System.out.println(s.getEmail());
       System.out.println(s.getId());
       System.out.println(s.getAddress());
       System.out.println(s.getSubject());

    }
}
