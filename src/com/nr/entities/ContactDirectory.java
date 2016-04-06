package com.nr.entities;

public class ContactDirectory {
	
	private Contact contact;

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public void displayContact(){
		contact.display();
	}
}
