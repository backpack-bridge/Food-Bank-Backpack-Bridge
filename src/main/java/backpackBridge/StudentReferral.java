package backpackBridge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentReferral {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long studentId;
	private String firstName;
	private String lastName;
	private int age;
	private int grade;
	private String teacherName;
	
	
	
	
	@ManyToOne
	private Foodsite foodSite;

	protected StudentReferral() {
}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Foodsite getFoodSite() {
		return foodSite;
	}

	public void setFoodSite(Foodsite foodSite) {
		this.foodSite = foodSite;
	}
}
