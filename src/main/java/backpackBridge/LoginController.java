package backpackBridge;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class LoginController {
	// extends WebMvcConfigurerAdapter {

	@Resource
	private AdminRepository adminRepository;

	// @Override
	// public void addViewControllers(ViewControllerRegistry loginregistry) {
	// loginregistry.addViewController("/welcome_login_screen").setViewName("welcome_login_screen");
	// }

	@GetMapping("/login-form")
	public String showLogin(Admin adminvalue) {
		return "login";
	}

	@PostMapping("/login-form")
	public String checkPersonInfo(@RequestParam(value = "id") String id,
			@RequestParam(value = "password") String password, @Valid Admin adminvalue, BindingResult bindingResult,
			Model model) {

		if (id != null) {
			model.addAttribute("admin", adminRepository.findOne(id));
		}

		if (bindingResult.hasErrors()) {
			return "error-login";
		}

		if (password != null) {
			if (password == adminvalue.getPassword()) {
				return "welcome_screen";
			} else {
				return "error-login";
			}
		}
		return "error-login";

	}
}