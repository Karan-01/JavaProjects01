package com.hibernate;

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
        System.out.println( "Hello World!" );
        ApplicationContext ac=new ClassPathXmlApplicationContext("projectspring1.xml");
       
        Student sts1=(Student)ac.getBean("Studentbean1");
        Student sts2=(Student)ac.getBean("Studentbean2");
        System.out.println(sts1);
        System.out.println(sts2);     
    }
}