package com.nr.main;

import com.nr.entities.BusinessContact;
import com.nr.entities.PersonalContact;

/**
 * 
 * @author narendra
 *
 */
public class ContactApplication {

	public static void main(String[] args) {
		
		PersonalContact persContact=new PersonalContact();
		persContact.display();
		
		BusinessContact busnContact=new BusinessContact();
		busnContact.display();
		

	}

}
