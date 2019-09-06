package com.mycompany.spring_demo_04_09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_demo_04_09.bean.BaseballCoach;
import com.mycompany.spring_demo_04_09.bean.CricketCoach;
import com.mycompany.spring_demo_04_09.bean.Employee;
import com.mycompany.spring_demo_04_09.bean.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	//Bean creation
        	ClassPathXmlApplicationContext context=new 
        			ClassPathXmlApplicationContext("applicationContext1.xml");
        	/*Coach myCoach=context.getBean("theCoach",BaseballCoach.class);
        	System.out.println(myCoach.getDailyWorkout());
        	Coach myCoach1=context.getBean("theCoach1",CricketCoach.class);
        	System.out.println(myCoach1.getDailyWorkout());
        	System.out.println(myCoach==myCoach1);
        
            	Coach theCoach=context.getBean("theCoach",Coach.class);
            	System.out.println(theCoach.getDailyWorkout()+" "+theCoach.getDailyFortune());*/
        	Employee employee=context.getBean("theEmployee",Employee.class);
            System.out.println(employee.getDetails());
            System.out.println(employee.getEmpAddress());	
            
    		} 
        	catch (Exception e) {
			// TODO: handle exception
		}
    }
}