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
	private long studentNumber;
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
	private String allergies;
	private String frl;
	private String status;
	private String parentPermission;
	private String parentFirstName;
	private String parentLastName;

	@ManyToOne
	private Foodsite foodSite;

	protected Student() {

	}

	public void setId(long id) {
		this.id = id;
	}

	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}

	public long getId() {
		return id;

	}

	public Long getStudentNumber() {
		return studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int getGrade() {
		return grade;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public int getPplInHouse() {
		return pplInHouse;
	}

	public int getAgeZeroToFive() {
		return ageZeroToFive;
	}

	public int getAgeSixToEleven() {
		return ageSixToEleven;
	}

	public int getAgeTwelveToSeventeen() {
		return ageTwelveToSeventeen;
	}

	public int getAgeEighteenToFiftyNine() {
		return ageEighteenToFiftyNine;
	}

	public int getAgeSixtyPLus() {
		return ageSixtyPLus;
	}

	public String getAddlNotes() {
		return addlNotes;
	}

	public String getAllergies() {
		return allergies;
	}

	public String getFrl() {
		return frl;
	}

	public String getStatus() {
		return status;
	}

	public Foodsite getFoodSite() {
		return foodSite;
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

	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}
}
