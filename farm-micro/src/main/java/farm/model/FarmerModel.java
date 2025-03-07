package farm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FarmerModel {
	public int id;
	public String firstName;
	public String lastName;
	public String email;
	public long contact;
	public String userName;
	public String password;
	public Address address;
	public BankAccountDeatil bankAccountDeatil;

}
