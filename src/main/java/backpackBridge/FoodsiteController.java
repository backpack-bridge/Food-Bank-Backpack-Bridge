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
			return "addSite";
		} else {
			model.addAttribute("site", foodSiteRepository.findOne(id));
			return "showSite";
		}
	}

	@PostMapping("/showSite")
	public String sitePost(@ModelAttribute Foodsite foodsite, Model model) {
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		foodSiteRepository.save(foodsite);
		return "siteList";
	}
	
	@RequestMapping("/showAllSites")
	public String Sites(Model model) {
		model.addAttribute("sites", foodSiteRepository.findAll());
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		return "siteList";
	}
//
//	@GetMapping("/showSites")
//	public String ShowSiteForm(@RequestParam(value = "id", required = false) String id, Model model) {
//		Admin currentSignon = signon.getCurrentUser();
//		model.addAttribute("signon", currentSignon);
//		if (id == null) {
//			model.addAttribute("site",
//					new Foodsite("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
//		} else {
//			model.addAttribute("site", foodSiteRepository.findOne(id));
//		}
//		return "Form_for_site_coordinator";
//	}
//
//	@PostMapping("/showSitesAdd")
//	public String ShowSiteForm(@ModelAttribute Foodsite site, Model model) {
//		foodSiteRepository.save(site);
//		Admin currentSignon = signon.getCurrentUser();
//		model.addAttribute("signon", currentSignon);
//		model.addAttribute("sites", foodSiteRepository.findAll());
//		return "SiteList";
//	}
//
	@GetMapping("/deleteSite")
	public String SiteDelete(@RequestParam(value = "id", required = true) String id, Model model) {
		foodSiteRepository.delete(id);
		Admin currentSignon = signon.getCurrentUser();
		model.addAttribute("signon", currentSignon);
		model.addAttribute("sites", foodSiteRepository.findAll());
		return "siteList";
	}
//
}
