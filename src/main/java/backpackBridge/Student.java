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

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	private long studentId;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	@Min(0)
	private int age;
	@NotNull
	@Size(min = 2, max = 12)
	private int grade;
	@NotNull
	private String teacherName;
	@NotNull
	@Min(0)
	private int pplInHouse;
	@NotNull
	@Size(min = 0, max = 5)
	private int ageZeroToFive;
	@NotNull
	@Size(min = 6, max = 11)
	private int ageSixToEleven;
	@NotNull
	@Size(min = 12, max = 17)
	private int ageTwelveToSeventeen;
	@NotNull
	@Size(min = 18, max = 59)
	private int ageEighteenToFiftyNine;
	@NotNull
	@Size(min = 60)
	private int ageSixtyPLus;
	@NotNull
	private String addlNotes;
	@NotNull
	private String allergies;
	private String frl;
	private String status;
	private String parentPermission;

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

	public void setAddlNotes(String addlNotes) {
		this.addlNotes = addlNotes;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public void setFrl(String frl) {
		this.frl = frl;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setFoodSite(Foodsite foodSite) {
		this.foodSite = foodSite;
	}

	public String getParentPermission() {
		return parentPermission;
	}

	public void setParentPermission(String parentPermission) {
		this.parentPermission = parentPermission;
	}
	}

	
