package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CONTACT_DTLS")
public class Contact {

	@Id
	@GeneratedValue
	private int cid;

	private String name;
	private String email;
	private Long  phoneNum;
	private String activeSw;    //this is for soft and hard delete
	
	
	
	
}
