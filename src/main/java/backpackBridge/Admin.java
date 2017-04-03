package backpackBridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private String id;
	private String password;
	private String passwordDate;
	private String studentAccess;
	private String siteAccess;
	private String volunteerAccess;
	private String adminAccess;
	private String changeDate;
	private String changeId;
	
	
	protected Admin() {
	}
	
	public Admin(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public Admin(String id, String password, String passwordDate,
			String studentAccess, String siteAccess, String volunteerAccess,
			String adminAccess, String changeDate, String changeId) {
		this.id = id;
		this.password = password;
		this.passwordDate = passwordDate;
		this.studentAccess = studentAccess;
		this.siteAccess = siteAccess;
		this.volunteerAccess = volunteerAccess;
		this.adminAccess = adminAccess;
		this.changeDate = changeDate;
		this.changeId = changeId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordDate() {
		return passwordDate;
	}

	public void setPasswordDate(String passwordDate) {
		this.passwordDate = passwordDate;
	}

	public String getStudentAccess() {
		return studentAccess;
	}

	public void setStudentAccess(String studentAccess) {
		this.studentAccess = studentAccess;
	}
	
	public boolean isStudentReadOnly() {
		if (studentAccess.equals("C")) {
			return false;
		}
		else {
			return true;
		}
	}

	public String getSiteAccess() {
		return siteAccess;
	}

	public void setSiteAccess(String siteAccess) {
		this.siteAccess = siteAccess;
	}
	
	public boolean isSiteReadOnly() {
		if (siteAccess.equals("C")) {
			return false;
		}
		else {
			return true;
		}
	}

	public String getVolunteerAccess() {
		return volunteerAccess;
	}

	public void setVolunteerAccess(String volunteerAccess) {
		this.volunteerAccess = volunteerAccess;
	}
	
	public boolean isVolunteerReadOnly() {
		if (volunteerAccess.equals("C")) {
			return false;
		}
		else {
			return true;
		}
	}

	public String getAdminAccess() {
		return adminAccess;
	}

	public void setAdminAccess(String adminAccess) {
		this.adminAccess = adminAccess;
	}
	
	public boolean isAdminReadOnly() {
		if (adminAccess.equals("C")) {
			return false;
		}
		else {
			return true;
		}
	}

	public String getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}

	public String getChangeId() {
		return changeId;
	}

	public void setChangeId(String changeId) {
		this.changeId = changeId;
	}

	

}
