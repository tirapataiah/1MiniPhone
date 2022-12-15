package in.ashokit.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Contact {
	
	@Id
	@GeneratedValue
	public Integer contactId;
	public String contactName;
	public String contactEmail;
	public long contactNum;

}
