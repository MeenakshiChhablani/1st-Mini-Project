package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;

public interface ContactService {
	
	 String upsert (Contact contact);  

     List<Contact> getAllContacts( );

	Contact getContact (int cid);

	 String deleteContact (int cid);


}
