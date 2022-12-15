package in.ashokit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Entity.Contact;
import in.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository Repo;

	@Override
	public String saveContact(Contact contact) {
		contact = Repo.save(contact);
		if(contact.getContactId() !=null) {
			
			return "contact saved";
		}else {
			return "contact failed to save";
		}
		
	}

	@Override
	public List<Contact> getAllContacts() {
		return Repo.findAll();
		//return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		
		Optional<Contact> findById = Repo.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}	
	

	@Override
	public String updateContact(Contact contact) {
		contact = Repo.save(contact);
		if(contact.getContactId() !=null) {
			
			return "contact saved";
		}else {
			return "contact failed to save";
		}
	}
	@Override
	public String deleteContactById(Integer contactId) {
		         Repo.deleteById(contactId);
		
		return "contact deleted...";
	}

}
