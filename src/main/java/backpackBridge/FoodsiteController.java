package backpackBridge;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoodsiteController {

	@Resource
	private FoodSiteRepository foodSiteRepository;

	@RequestMapping("/showSites")
	public String allsites(Model model) {
		model.addAttribute("sites", foodSiteRepository.findAll());
		return "all-sites";
	}

	@GetMapping("/showOneSite")
	public String onesite(@RequestParam(value = "id") String id, Model model) {
		model.addAttribute("site", foodSiteRepository.findOne(id));
		return "one-site";
	}

	@PostMapping("/inputSiteInfo")
	public String inputSiteInfo(@ModelAttribute Foodsite foodsite) {
		return "input-site-info";
	}

}
