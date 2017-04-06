package backpackBridge;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

	@Resource
	private AdminRepository repository;

	@RequestMapping("/showAdmins")
	public String admins(Model model) {
		model.addAttribute("admins", repository.findAll());

		model.addAttribute("admin", repository.findOne("ToddisGod"));
		return "adminList";
	}

	@GetMapping("/showAdmin")

	public String adminForm(@RequestParam(value = "id", required = false) 
		String id, Model model) {
		if (id == null) {
			// create an empty Admin object
			model.addAttribute("admin", new Admin("","","","","","","","",""));
		} else {
			model.addAttribute("admin", repository.findOne(id));
		}
		return "Administration";
	}

	@PostMapping("/showAdmin")
	public String adminSubmit(@ModelAttribute Admin admin) {

		repository.save(admin);
		return "Administration";
	}

	@GetMapping("/deleteAdmin")
	public String adminDelete(@RequestParam(value = "id", required = true) 
		String id, Model model) {
		repository.delete(id);
		model.addAttribute("admins", repository.findAll());
		model.addAttribute("admin", repository.findOne("ToddisGod"));
		return "adminList";
	}
}