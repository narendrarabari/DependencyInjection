package com.nr.main;

import com.nr.entities.BusinessContact;
import com.nr.entities.Contact;
import com.nr.entities.PersonalContact;

/**
 * 
 * @author narendra
 *
 */
public class ContactApplication {

	public static void main(String[] args) {
		
		Contact contact=new PersonalContact();
		contact.display();
		
		contact=new BusinessContact();
		contact.display();
	}

}
