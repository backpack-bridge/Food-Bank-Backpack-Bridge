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
	
	@Resource
	private SignOn signon;
	
	@RequestMapping("/showSites")
	public String sites(Model model) {
	model.addAttribute("sites", foodSiteRepository.findAll());
	Admin currentSignon = signon.getCurrentUser();
	model.addAttribute("signon", currentSignon);
	return "siteList";
	}
	
	@GetMapping("/showSite")
	public String site(@RequestParam(value = "id", required = false) String id, Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		if (id == null) {
			// create an empty Foodsite object
			model.addAttribute("site", 
					new Foodsite("","","","","","","","","","","","","","","","","","","","",""));
			return "adminAdd";
		} else {
			model.addAttribute("site", foodSiteRepository.findOne(id));
			return "showSites";
		}
	}

	@GetMapping("/formForSiteCoordinator")
	public String siteForm(Model model) {
		model.addAttribute("sites", foodSiteRepository.findAll());
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		return "site";
	}

	@PostMapping("/formForSiteCoordinator")
	public String siteFormSubmit(@ModelAttribute Foodsite foodsite,Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		return "display-site-information";
	}

	@RequestMapping("/showOneSite")
	public String onesite(@RequestParam(value = "id") String id, Model model) {
		model.addAttribute("site", foodSiteRepository.findOne(id));
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		return "one-site";
	}

	@PostMapping("/showOneSites")
	public String inputSiteInfo(@ModelAttribute Foodsite foodsite, Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		return "input-site-info";
	}

}
