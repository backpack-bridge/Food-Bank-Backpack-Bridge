package backpackBridge;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InfoController {

	@Resource
	private AdminRepository repo;

	@GetMapping("/form_directory")
	public String forms() {
		return "form_directory";
	}

	@GetMapping("/e-form-site-coordinator")
	public String site_coordinator_form() {
		return "form_to_become_site_coordinaor";
	}

}