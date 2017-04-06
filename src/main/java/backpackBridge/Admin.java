package backpackBridge;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Admin {

	@Id
	@NotEmpty
	private String id;
	@NotEmpty
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

	public Admin(String id, String password, String passwordDate, String studentAccess, String siteAccess,
			String volunteerAccess, String adminAccess, String changeDate, String changeId) {
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
	
//	public Admin(String id, String password, String studentAccess, 
//			String siteAccess, String volunteerAccess, String adminAccess) {
//		this.id = id;
//		this.password = password;
//		this.studentAccess = studentAccess;
//		this.siteAccess = siteAccess;
//		this.volunteerAccess = volunteerAccess;
//		this.adminAccess = adminAccess;
//	}

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
		} else {
			return true;
		}
	}
	
	public boolean isStudentHide() {
		if (studentAccess.equals(null)|studentAccess.equals("")) {
			return true;
		} else {
			if (studentAccess.equals(" ")) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public boolean isStudentAdd() {
		if (studentAccess.equals(null)|studentAccess.equals("")) {
			return false;
		} else {
			if (studentAccess.equals("C") | studentAccess.equals("A")) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public boolean isStudentDelete() {
		if (studentAccess.equals("D") | studentAccess.equals("C")) {
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
		} else {
			return true;
		}
	}
	
	public boolean isSiteHide() {
		if (siteAccess.equals(null)|siteAccess.equals("")) {
			return true;
		} else {
			if (siteAccess.equals(" ")) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public boolean isSiteAdd() {
		if (siteAccess.equals(null)|siteAccess.equals("")) {
			return false;
		} else {
			if (siteAccess.equals("C") | siteAccess.equals("A")) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public boolean isSiteDelete() {
		if (siteAccess.equals("D") | siteAccess.equals("C")) {
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
	
	public boolean isVolunteerHide() {
		if (volunteerAccess.equals(null)|volunteerAccess.equals("")) {
			return true;
		} else {
			if (volunteerAccess.equals(" ")) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	public boolean isVolunteerReadOnly() {
		if (volunteerAccess.equals("C")) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isVolunteerAdd() {
		if (volunteerAccess.equals(null)|volunteerAccess.equals("")) {
			return false;
		} else {
			if (volunteerAccess.equals("C") | volunteerAccess.equals("A")) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public boolean isVolunteerDelete() {
		if (volunteerAccess.equals("D") | volunteerAccess.equals("C")) {
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
  
	public boolean isAdminHide() {
		if (adminAccess.equals(null)|adminAccess.equals("")) {
			return true;
		} else {
			if (adminAccess.equals(" ")) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public boolean isAdminReadOnly() {
		if (adminAccess.equals(null)|adminAccess.equals("")) {
			return false;
		} else {
			if (adminAccess.equals("C") | adminAccess.equals("A")) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public boolean isAdminAdd() {
		if (adminAccess.equals(null)|adminAccess.equals("")) {
			return false;
		} else {
			if (adminAccess.equals("C") | adminAccess.equals("A")) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public boolean isAdminDelete() {
		if (adminAccess.equals("D") | adminAccess.equals("C")) {
			return false;
		} else {
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
