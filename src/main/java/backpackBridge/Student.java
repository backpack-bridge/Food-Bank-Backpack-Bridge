package backpackBridge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long studentId;
	private String firstName;
	private String lastName;
	private int age;
	private int grade;
	private String teacherName;
	private int pplInHouse;
	private int ageZeroToFive;
	private int ageSixToEleven;
	private int ageTwelveToSeventeen;
	private int ageEighteenToFiftyNine;
	private int ageSixtyPLus;
	private String addlNotes;

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
}
