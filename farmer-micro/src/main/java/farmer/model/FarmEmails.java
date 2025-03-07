package farmer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FarmEmail")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FarmEmails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String Emails;
	
	public FarmEmails(String emails) {
		this.Emails = emails;
	}
	
	

}
