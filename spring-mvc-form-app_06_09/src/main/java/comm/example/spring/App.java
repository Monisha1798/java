package comm.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.spring.form.*;

public class App {

    public static void main( String[] args )
    {
        try {
        	
        	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
    		} 
        	catch (Exception e) {
			// TODO: handle exception
		}
    }

}
