package backpackBridge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotEmpty
	private long studentId;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	@Min(0)
	private int age;
	@NotEmpty
	@Size(min = 2, max = 12)
	private int grade;
	@NotEmpty
	private String teacherName;
	@NotEmpty
	@Min(0)
	private int pplInHouse;
	@NotEmpty
	@Size(min = 0)
	private int ageZeroToFive;
	@NotEmpty
	@Size(min = 0)
	private int ageSixToEleven;
	@NotEmpty
	@Size(min = 0)
	private int ageTwelveToSeventeen;
	@NotEmpty
	@Size(min = 0)
	private int ageEighteenToFiftyNine;
	@NotEmpty
	@Size(min = 0)
	private int ageSixtyPLus;
	@NotEmpty
	private String addlNotes;
	@NotEmpty
	private String allergies;

	@ManyToOne
	private Foodsite foodSite;

	protected Student() {

	}

	public void setId(long id) {
		this.id = id;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
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

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public void setPplInHouse(int pplInHouse) {
		this.pplInHouse = pplInHouse;
	}

	public String getAddlNotes() {
		return addlNotes;
	}

	public void setAddlNotes(String addlNotes) {
		this.addlNotes = addlNotes;
	}

	public void setAgeZeroToFive(int ageZeroToFive) {
		this.ageZeroToFive = ageZeroToFive;
	}

	public void setAgeSixToEleven(int ageSixToEleven) {
		this.ageSixToEleven = ageSixToEleven;
	}

	public void setAgeTwelveToSeventeen(int ageTwelveToSeventeen) {
		this.ageTwelveToSeventeen = ageTwelveToSeventeen;
	}

	public void setAgeEighteenToFiftyNine(int ageEighteenToFiftyNine) {
		this.ageEighteenToFiftyNine = ageEighteenToFiftyNine;
	}

	public void setAgeSixtyPLus(int ageSixtyPLus) {
		this.ageSixtyPLus = ageSixtyPLus;
	}

	public void setFoodSite(Foodsite foodSite) {
		this.foodSite = foodSite;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
}
