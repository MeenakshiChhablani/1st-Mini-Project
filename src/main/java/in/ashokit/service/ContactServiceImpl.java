package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	
	@Autowired
	private ContactRepository repo;
	
	//this method is before soft delete
	/*@Override
	public String upsert(Contact contact) {
	Contact save=  repo.save(contact);
		return "SUCCESS ";
	}*/
	
	
	
	//soft delete implementation
	@Override
	public String upsert(Contact contact) {
		contact.setActiveSw("Y");
       repo.save(contact);  //here we are setting active switch yes from starting 
		return "SUCCESS ";
	}

	@Override
	public List<Contact> getAllContacts() {
		 return repo.findAll();
	
	}

	@Override
	public Contact getContact(int cid) {
		Optional<Contact> findById=repo.findById(cid);
		if(findById.isPresent()) {
		return findById.get();
	    }
		return null;
	}
	
	
	//this delet method is for hard delete
	/*@Override
	public String deleteContact(int cid) {
		repo.deleteById(cid);
		return "Contact Deleted Successfully";
	}*/

	
	
	//for soft delete
	@Override
	public String deleteContact(int cid) {
		//repo.deleteById(cid);
		Optional<Contact> findById=repo.findById(cid);    //here first we will get value 
		if(findById.isPresent()) {   //then we will check Id is present or not then 
	Contact contact = findById.get();   // then we will get the data a
	  contact.setActiveSw("N");  //and we will update the activesw as "N"
	  repo.save(contact);  //and here we will save the record 
	    }    
		return "Contact soft Deleted Successfully";
	}
	
	//here soft delete method is updateing the record .
}
