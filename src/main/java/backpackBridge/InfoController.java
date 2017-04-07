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

	@RequestMapping("/welcome_screen{id}")
	public String admins(@PathVariable String id, Model model) {
		model.addAttribute("admin", repo.findOne(id));
		return "welcome_screen";
	}

}