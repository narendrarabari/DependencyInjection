package com.nr.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nr.entities.ContactDirectory;

/**
 * 
 * @author narendra
 *
 */
public class ContactApplication {

	private static ApplicationContext context;

	public static void main( String[] args )
    {
    	context = new ClassPathXmlApplicationContext("/com/nr/config/Bean.xml");
    	
    	ContactDirectory contactDirectory= (ContactDirectory) context.getBean("contactDirectory");
    	
    	contactDirectory.displayContact();
    	
    	
    }


}
