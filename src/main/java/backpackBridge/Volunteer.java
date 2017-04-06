package backpackBridge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Volunteer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	@Min(0)
	private int age;
	@NotEmpty
	private String gender;
	@NotEmpty
	private String streetAddress;
	@NotEmpty
	private String city;
	@NotEmpty
	private String state;
	@NotEmpty
	private String zip;
	@NotEmpty
	private String phoneNum;
	@NotEmpty
	@Email
	private String email;

	@ManyToOne
	private Foodsite foodSite;

	protected Volunteer() {
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
