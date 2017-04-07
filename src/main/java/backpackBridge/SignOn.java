package backpackBridge;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SignOn {

	private Admin currentUser;

	public Admin getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(Admin currentUser) {
		this.currentUser = currentUser;
	}
	
	
}