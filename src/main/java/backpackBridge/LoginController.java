package backpackBridge;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Resource
	private AdminRepository adminRepository;

	@Resource
	private SignOn signOn;

	@GetMapping("/login-form")
	public String showLogin(Admin adminvalue) {
		return "login";
	}

	@PostMapping("/login-form")
	public String checkPersonInfo(@RequestParam(value = "id") String id,
			@RequestParam(value = "password") String password,  Model model) {

		if (id == null || password == null) {
			return "error-login";
		}
		
		Admin adminValue = adminRepository.findOne(id);
		if (adminValue == null) {
			return "error-login";
		}
		model.addAttribute("admin", adminValue);
		
		if (password.equals(adminValue.getPassword())) {
			signOn.setCurrentUser(adminValue);
			Admin currentSignon = signOn.getCurrentUser();
			model.addAttribute("signon", currentSignon);
			return "welcome_screen";
		} 
		
		return "error-login";
	}
	
	@RequestMapping("/welcome_screen")
	public String home(Model model) {
		Admin currentSignon = signOn.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		return "welcome_screen";
	}
	
}