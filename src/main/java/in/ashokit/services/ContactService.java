package in.ashokit.services;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.Entity.Contact;


public interface ContactService {

	public String saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public String updateContact(Contact contact);
	
	public String deleteContactById(Integer contactId);
	
}
