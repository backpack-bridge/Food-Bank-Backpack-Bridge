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

	@RequestMapping("/showAllSites")
	public String Sites(Model model) {
		model.addAttribute("sites", foodSiteRepository.findAll());
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		return "SiteList";
	}

	@GetMapping("/showSites")
	public String ShowSiteForm(@RequestParam(value = "id", required = false) String id, Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		if (id == null) {
			model.addAttribute("site",
					new Foodsite("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
		} else {
			model.addAttribute("site", foodSiteRepository.findOne(id));
		}
		return "Form_for_site_coordinator";
	}

	@PostMapping("/showSites")
	public String ShowSiteForm(@ModelAttribute Foodsite site) {

		foodSiteRepository.save(site);
		return "Form_for_site_coordinator";
	}

	@GetMapping("/showDeletedSite")
	public String SiteDelete(@RequestParam(value = "id", required = true) String id, Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		foodSiteRepository.delete(id);
		model.addAttribute("sites", foodSiteRepository.findAll());
		model.addAttribute("site", foodSiteRepository.findOne("ToddisGod"));
		return "Site_Coordinators";
	}

}
