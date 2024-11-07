package com.firstsp;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println( "Hello World!" );
        ApplicationContext c1 = new ClassPathXmlApplicationContext("config.xml");
       Employee ss1=(Employee) c1.getBean("e1");
       System.out.println(ss1);
    }
}
